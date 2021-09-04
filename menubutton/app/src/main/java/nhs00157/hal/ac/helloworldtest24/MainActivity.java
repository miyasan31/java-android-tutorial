package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{
    private TextView aTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTextView = (TextView)findViewById(R.id.myTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0,0, "Apple");
        menu.add(0, 1, 1,"Banana");
        menu.add(0, 2, 3,"Orange");
        menu.add(1, 0,4, "Peach");
        menu.add(1, 0, 2,"Grape");
        menu.add(2, 1, 5,"東京");
        menu.add(2, 2, 6,"名古屋");
        menu.add(2, 3, 7,"大阪");
        menu.add(2, 4, 9,"福岡");
        menu.add(3, 0, 10,"ディズニーランド");
        menu.add(3, 1, 11,"USJ");
        menu.add(3, 2, 12,"長嶋スパーランド");
        menu.add(3, 3, 13,"モンキーパーク");
        menu.add(3, 4, 14,"東山動物園");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int gid = item.getGroupId();
        int iid = item.getItemId();
        String iName = (String)item.getTitleCondensed();
        aTextView.setText(String.format(
                "Menu %d,%d,%s, selcted.",gid,iid, iName
        ));
        return true;
    }



}