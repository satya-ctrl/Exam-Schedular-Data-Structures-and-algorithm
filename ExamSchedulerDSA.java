import java.util.*;

class ExamSchedulerDSA {
    private Map<String, Integer> schedule;
    private PriorityQueue<Integer> availableLectureSlots;
    private int[] availableTutorialSlots;
    private int[] availableLabSlots;

    public ExamSchedulerDSA() {
        this.schedule = new HashMap<>();
        this.availableLectureSlots = new PriorityQueue<>();
        this.availableTutorialSlots = new int[]{1, 6};
        this.availableLabSlots = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 7; i <= 12; i++) {
            this.availableLectureSlots.offer(i);
        }
    }

    public boolean scheduleExam(String course, String examType) {
        if ("lecture".equals(examType)) {
            return scheduleLecture(course);
        } else if ("tutorial".equals(examType)) {
            return scheduleTutorial(course);
        } else if ("lab".equals(examType)) {
            return scheduleLab(course);
        } else {
            System.out.println("Invalid exam type");
            return false;
        }
    }

    private boolean scheduleLecture(String course) {
        if (!availableLectureSlots.isEmpty()) {
            int slot = availableLectureSlots.poll();
            schedule.put(course, slot);
            return true;
        }
        return false;
    }

    private boolean scheduleTutorial(String course) {
        for (int slot : availableTutorialSlots) {
            if (!schedule.containsValue(slot)) {
                schedule.put(course, slot);
                return true;
            }
        }
        return false;
    }

    private boolean scheduleLab(String course) {
        for (int slot : availableLabSlots) {
            // Check if three consecutive slots are available
            if (!schedule.containsValue(slot) && !schedule.containsValue(slot + 1) && !schedule.containsValue(slot + 2)) {
                for (int i = 0; i < 3; i++) {
                    schedule.put(course, slot + i);
                }
                return true;
            }
        }
        return false;
    }

    public Map<String, Integer> getSchedule() {
        return schedule;
    }

    public static void main(String[] args) {
        ExamSchedulerDSA scheduler = new ExamSchedulerDSA();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter course name (or 'exit' to finish): ");
            String course = scanner.nextLine();

            if ("exit".equalsIgnoreCase(course)) {
                break;
            }

            System.out.println("Enter exam type (lecture/tutorial/lab): ");
            String examType = scanner.nextLine();

            boolean scheduled = scheduler.scheduleExam(course, examType);

            if (scheduled) {
                System.out.println("Exam scheduled successfully!");
            } else {
                System.out.println("Failed to schedule the exam. Please try again.");
            }
        }

        System.out.println("Exam Schedule:");
        System.out.println(scheduler.getSchedule());
    }
}
