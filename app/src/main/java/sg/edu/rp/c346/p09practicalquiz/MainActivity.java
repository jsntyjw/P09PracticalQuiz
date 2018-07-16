package sg.edu.rp.c346.p09practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<FormulaItem> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormulaList = new ArrayList<>();
        FormulaItem formula1 = new FormulaItem("Area of rectangle","Length x Length","Formula type is: Area");
        FormulaItem formula2 = new FormulaItem("Area of trangle","(Length of base x Length)/2","Formula type is: Area");
        FormulaItem formula3 = new FormulaItem("Volume of cube","Length x Length x Length","Formula type is: Volume");

        alFormulaList.add(formula1);
        alFormulaList.add(formula2);
        alFormulaList.add(formula3);

        caFormula = new CustomAdapter(this,R.layout.item,alFormulaList);

        lvFormula.setAdapter(caFormula);
    }
}
