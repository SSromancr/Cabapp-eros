package tools;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;

import com.example.monitor.cabappneros.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by monitor on 24/05/2017.
 */

public class ComunityTools  {
    static public  PopupWindow popupWindow;
     public static ImageView abrirPopup(View v, Activity x){
         View popupView;
         LayoutInflater layoutInflater;
         ImageView btn_Cerrar;
         ImageView aux=(ImageView)v;
         layoutInflater = (LayoutInflater) x.getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
         popupView = layoutInflater.inflate(R.layout.activity_popup2,null);
         ImageView miImage= (ImageView) popupView.findViewById(R.id.imageView);

         popupWindow = new PopupWindow(popupView, RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.MATCH_PARENT);
        popupWindow.showAtLocation(popupView, Gravity.CENTER,0,0);
            btn_Cerrar = (ImageView) popupView.findViewById(R.id.id_cerrar);
            btn_Cerrar.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    popupWindow.dismiss();
                }
            });
            return miImage;
        }


}

