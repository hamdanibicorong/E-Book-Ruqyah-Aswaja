package me.developermuda.www.bdrawer.ContenRuqyah;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import me.developermuda.www.bdrawer.R;
import me.developermuda.www.bdrawer.detail.ScrollingDoaActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class BtnDoaFragment extends Fragment implements View.OnClickListener {


    public BtnDoaFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button btnDoa,btn2;
        

            // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_doa, container, false);

        btnDoa = view.findViewById(R.id.btn_doa);
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index1.html");
                startActivity(intent);
            }
        });

        btn2 = view.findViewById(R.id.btn_doa2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index2.html");
                startActivity(intent);
            }
        });


       Button btn3 = view.findViewById(R.id.btn_doa3);
       btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
               intent.putExtra("url", "file:///android_asset/index3.html");
               startActivity(intent);
           }
       });

       Button btn4 = view.findViewById(R.id.btn_doa4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index4.html");
                startActivity(intent);

            }
        });

        Button btn5 = view.findViewById(R.id.btn_doa5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index4.html");
                startActivity(intent);

            }
        });
        Button btn6 = view.findViewById(R.id.btn_doa6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index5.html");
                startActivity(intent);
            }
        });
        Button btn7 = view.findViewById(R.id.btn_doa7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),RuqyahWebActivity.class);
                startActivity(intent);
            }
        });
        Button btn8 = view.findViewById(R.id.btn_doa8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index6.html");
                startActivity(intent);
            }
        });

        Button btn9 = view.findViewById(R.id.btn_doa9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index7.html");
                startActivity(intent);
            }
        });

        Button btn10 = view.findViewById(R.id.btn_doa10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index8.html");
                startActivity(intent);
            }
        });

        Button btn11 = view.findViewById(R.id.btn_doa11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index9.html");
                startActivity(intent);
            }
        });
        Button btn12 = view.findViewById(R.id.btn_doa12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ScrollingDoaActivity.class);
                intent.putExtra("url", "file:///android_asset/index10.html");
                startActivity(intent);
            }
        });



        return view;

        }

    @Override
    public void onClick(View v) {


        }

    }

