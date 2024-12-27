package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {
    public static void main(String[] args) {
        JSONObject student1 = new JSONObject();
        JSONObject student2 = new JSONObject();
        student1.put("studentName", "Timur");
        student1.put("grade", "magister");
        student1.put("location", "GE");

        student2.put("studentName", "Polina");
        student2.put("grade", "ordinator");
        student2.put("location", "GE");

        System.out.println(student1.toJSONString());

        JSONArray students = new JSONArray();
        students.add(student1);
        students.add(student2);

        System.out.println(students.toJSONString());

        JSONObject details = new JSONObject();
        details.put("studentDetails", students);

        System.out.println(details.toJSONString());
    }
}
