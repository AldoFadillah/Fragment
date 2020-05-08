package com.example.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.fragment.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
    //komik klasik
    public void browsernews (View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://bumilangit.com/en/news/"));
        startActivity(browserIntent);
    }
    public void patriot(View view) {
        startActivity(new Intent(MainActivity.this, patriotActivity.class));
    }
    //gundala klasik
    public void gundalapp(View view) {
        startActivity(new Intent(MainActivity.this, GundalappActivity.class));
    }
    public void gundalasp(View view) {
        startActivity(new Intent(MainActivity.this, gundalaspActivity.class));
    }
    public void gundalajw(View view) {
        startActivity(new Intent(MainActivity.this, gundalajwActivity.class));
    }
    // si buta klasik
    public void klasikbuta(View view) {
        startActivity(new Intent(MainActivity.this, klasikbutaActivity.class));
    }
    public void mborobudur(View view) {
        startActivity(new Intent(MainActivity.this, mborobudurActivity.class));
    }
    public void bdps(View view) {
        startActivity(new Intent(MainActivity.this, bdpsActivity.class));
    }
    //godam klasik
    public void drsetan(View view) {
        startActivity(new Intent(MainActivity.this, drsetanActivity.class));
    }
    public void ggadungan(View view) {
        startActivity(new Intent(MainActivity.this, ggadunganActivity.class));
    }
    public void kaumteroris(View view) {
        startActivity(new Intent(MainActivity.this, kaumterorisActivity.class));
    }
    //karakter wanita bumi langit
    public void tira(View view) {
        startActivity(new Intent(MainActivity.this, tiraActivity.class));
    }
    public void sitigahara(View view) {
        startActivity(new Intent(MainActivity.this, sitigaharaActivity.class));
    }
    public void marni(View view) {
        startActivity(new Intent(MainActivity.this, marniActivity.class));
    }
    public void sriasih(View view) {
        startActivity(new Intent(MainActivity.this, sriasih2Activity.class));
    }
    public void virgo(View view) {
        startActivity(new Intent(MainActivity.this, virgoActivity.class));
    }
    public void merpati(View view) {
        startActivity(new Intent(MainActivity.this, merpatiActivity.class));
    }
    public void bme(View view) {
        startActivity(new Intent(MainActivity.this, bmeActivity.class));
    }
    public void selendangm(View view) {
        startActivity(new Intent(MainActivity.this, selendangmActivity.class));
    }
    public void camar(View view) {
        startActivity(new Intent(MainActivity.this, camarActivity.class));
    }
    //Era Baru
    // gundala
    public void prahara(View view) {
        startActivity(new Intent(MainActivity.this, praharaActivity.class));
    }
    public void gundalakoma(View view) {
        startActivity(new Intent(MainActivity.this, gundalakomaActivity.class));
    }
    // si buta dari gua hantu
    public void newerabuta(View view) {
        startActivity(new Intent(MainActivity.this, newerabutaActivity.class));
    }
    public void matamalaikat(View view) {
        startActivity(new Intent(MainActivity.this, matamalaikatActivity.class));
    }
    public void matamalaikat2(View view) {
        startActivity(new Intent(MainActivity.this, matamalaikat2Activity.class));
    }
    //godam
    public void godam(View view) {
        startActivity(new Intent(MainActivity.this, godamActivity.class));
    }
    // penjahat
    public void vmatamalaikat(View view) {
        startActivity(new Intent(MainActivity.this, vmatamalaikatActivity.class));
    }
    public void vserulingsukma(View view) {
        startActivity(new Intent(MainActivity.this, vserulingsukmaActivity.class));
    }
    public void vleakhitam(View view) {
        startActivity(new Intent(MainActivity.this, vleakhitamActivity.class));
    }
    public void vsapujagat(View view) {
        startActivity(new Intent(MainActivity.this, vsapujagatActivity.class));
    }
    public void vbanyujaga(View view) {
        startActivity(new Intent(MainActivity.this, vbanyujagaActivity.class));
    }
    public void vghazul(View view) {
        startActivity(new Intent(MainActivity.this, vghazulActivity.class));
    }
    public void vpengkor(View view) {
        startActivity(new Intent(MainActivity.this, vpengkorActivity.class));
    }
    public void vdrsyaithon(View view) {
        startActivity(new Intent(MainActivity.this, vdrsyaithonActivity.class));
    }
    public void vbocahatlantis(View view) {
        startActivity(new Intent(MainActivity.this, vbocahatlantisActivity.class));
    }

}