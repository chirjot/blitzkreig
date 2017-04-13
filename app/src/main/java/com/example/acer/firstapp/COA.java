package com.example.acer.firstapp;

import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class COA extends AppCompatActivity {
    public StorageReference sref;
    public Dialog dialog;
    TextView notavail;
    public DownloadManager dm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new NotesFragment()).commit();
        sref= FirebaseStorage.getInstance().getReference().child("Sem 4 IT");
        dm=(DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        dialog=new Dialog(this);
        dialog.setContentView(R.layout.notavailable);
        notavail=(TextView)dialog.findViewById(R.id.notvailable);
        notavail.setText("NOT AVAILABLE");
        notavail.setTextColor(Color.RED);

    }

    public void changeme(View view) {
        int btnid=view.getId();
        FragmentManager mgr=getSupportFragmentManager();
        FragmentTransaction tran=mgr.beginTransaction();

        switch (btnid){
            case R.id.btnNotes:
                tran.replace(R.id.fragment,new NotesFragment());
                break;
            case R.id.btnPrev:
                tran.replace(R.id.fragment,new PrevyrsFragment());
                break;
            case R.id.btnAssignments:
                tran.replace(R.id.fragment,new AssignFragment());
                break;
        }
        tran.commit();
    }

    public void Click(View view) {
        switch (view.getId())
        {
            case R.id.ibdownload12:

                 dialog.show();


                break;
            case R.id.ibpreview12 :
                dialog.show();

                break;
            case R.id.ibdownload22:
                dialog.show();
                break;
            case R.id.ibpreview22:
                dialog.show();
                break;
            case R.id.ibdownload32:
                dialog.show();
                break;
            case R.id.ibpreview32:
                dialog.show();
                break;
        }
    }


    public void Assign(View view) {
        switch (view.getId())
        {
            case R.id.ibdownload11:
                StorageReference assign1=sref.child("COA").child("Assignments").child("COA Assignment 1(K).pdf");
                assign1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview11:
                Intent send2=new Intent(COA.this,PreviewActivity.class);
                send2.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4anZtV2EwOHY5Z2c");
                startActivity(send2);
                break;
            case R.id.ibdownload21:
                StorageReference assign2=sref.child("COA").child("Notes").child("COA 2(A).pdf");
                assign2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview21:
                Intent send3=new Intent(COA.this,PreviewActivity.class);
                send3.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4dm5OeUprLU82Rm8");
                startActivity(send3);
                break;
            case R.id.ibdownload31:
                StorageReference assign3=sref.child("COA").child("Assignments").child("Coa 3.pdf");
                assign3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview31:
                Intent send4=new Intent(COA.this,PreviewActivity.class);
                send4.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4WWpLNTh3cmxMRWc");
                startActivity(send4);
                break;
            case R.id.ibdownload41:
                StorageReference assign4=sref.child("COA").child("Assignments").child("All assignments COA.pdf");
                assign4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview41:
                Intent send5=new Intent(COA.this,PreviewActivity.class);
                send5.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4eDBGUm1oRmN1VnM");
                startActivity(send5);
                break;
        }
    }

    public void Notes(View view) {
        switch (view.getId())
        {
            case R.id.ibdownload1:
                StorageReference sref1=sref.child("COA").child("Notes").child("Unit 1 COA.zip");
                sref1.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview1:
                Intent send=new Intent(COA.this,PreviewActivity.class);
                send.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4a2lDSldiUmdXVms");
                startActivity(send);
                break;
            case R.id.ibdownload2:
                StorageReference sref2=sref.child("COA").child("Notes").child("Unit 2 COA.zip");
                sref2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });

                break;
            case R.id.ibpreview2:
                Intent send2=new Intent(COA.this,PreviewActivity.class);
                send2.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4NV9VQ054MGNLcDQ");
                startActivity(send2);
                break;
            case R.id.ibdownload3:
                StorageReference sref3=sref.child("COA").child("Notes").child("Unit 3 COA.zip");
                sref3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview3:
                Intent send3=new Intent(COA.this,PreviewActivity.class);
                send3.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4QjZ5SkVmQy1XVTA");
                startActivity(send3);
                break;
            case R.id.ibdownload4:
                StorageReference sref4=sref.child("COA").child("Notes").child("Unit 4 COA.zip");
                sref4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibpreview4:
                Intent send4=new Intent(COA.this,PreviewActivity.class);
                send4.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4ZTNjTENpR2NzdU0");
                startActivity(send4);
                break;
            case R.id.ibpreview5:
                Intent send5=new Intent(COA.this,PreviewActivity.class);
                send5.putExtra("values","https://drive.google.com/open?id=0Bzj6H64n6fe4Y2t0elM5UlZUS3c");
                startActivity(send5);
                break;
            case R.id.ibdownload5:
                StorageReference sref5=sref.child("COA").child("Notes").child("Extra COA.zip");
                sref5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        download(uri);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
                break;
            case R.id.ibclick :
                break;
        }
    }
    public void download(Uri uri){
        Uri downloaduri=uri;
        String sd12= URLUtil.guessFileName(downloaduri.toString(),null, MimeTypeMap.getFileExtensionFromUrl(downloaduri.toString()));
        DownloadManager.Request rq12=new DownloadManager.Request(downloaduri);
        rq12.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,sd12);
        rq12.setNotificationVisibility(rq12.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        dm.enqueue(rq12);
    }

}
