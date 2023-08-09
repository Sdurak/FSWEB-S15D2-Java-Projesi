package setChallenge;

import java.util.*;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

//    public TaskData() {
//        annsTasks = new HashSet<>();
//        bobsTasks = new HashSet<>();
//        carolsTasks = new HashSet<>();
//    } /// bu belli bir sınıfa direkt ilişki kurup sınırlandırıyor.

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String name) {
        if (name.equals("ann")) {
            return annsTasks;
        } else if (name.equals("bob")) {
            return bobsTasks;
        } else if ("carol".equals("carol")) {
            return carolsTasks;
        } else if (name.equals("all")) {
            List<Set<Task>> allTasks = new ArrayList<>();
            allTasks.add(annsTasks);
            allTasks.add(bobsTasks);
            allTasks.add(carolsTasks);
            return getUnion(allTasks);
        } else {
            return new HashSet<>();
        }
    }
//    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
//        Set<Task> union = new HashSet<>(set1);
//        union.addAll(set2);
//        return union;
//    }

    public Set<Task> getUnion(List<Set<Task>> allTasks) {  //set listesi add.all yaparak birleştirip dönücek.
        Set<Task> totals = new LinkedHashSet<>();
        for (Set<Task> tasks : allTasks) {
            totals.addAll(tasks);
        }
        return totals;
    }
    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        //intersection.retainAll(third);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> differences = new HashSet<>(first);
        differences.removeAll(second);
        return differences;
    }

}
