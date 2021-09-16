package com.example.gofitpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    lateinit var HomeFragment : HomeFragment
    lateinit var CalorieCounterFragment: CalorieCounterFragment
    lateinit var DietPlanFragment: DietPlanFragment
    lateinit var WorkoutPlanFragment: WorkoutPlanFragment
    lateinit var TodaysIntakeFragment: TodaysIntakeFragment
    lateinit var WeeklyReportFragment: WeeklyReportFragment
    lateinit var SettingsFragment: SettingsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)
        val actionBar = supportActionBar
        actionBar?.title = "Navigation Drawer"


        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolBar,
            (R.string.open),
            (R.string.close)
        ) {

        }
        drawerToggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        nav_view.setNavigationItemSelectedListner(this)

        HomeFragment = HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout,HomeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()



    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {

        when (menuItem.itemId){

            R.id.home -> {
                HomeFragment = HomeFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,HomeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.calculate -> {
                CalorieCounterFragment = CalorieCounterFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,CalorieCounterFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.diet -> {
                DietPlanFragment = DietPlanFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,DietPlanFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.workout -> {
                WorkoutPlanFragment = WorkoutPlanFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,WorkoutPlanFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.todaysintake -> {
                TodaysIntakeFragment = TodaysIntakeFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,TodaysIntakeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.setting -> {
                WeeklyReportFragment = WeeklyReportFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,WeeklyReportFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }

            R.id.setting -> {
                SettingsFragment = SettingsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout,SettingsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }


        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        else{
            super.onBackPressed()
        }
        super.onBackPressed()
    }
}