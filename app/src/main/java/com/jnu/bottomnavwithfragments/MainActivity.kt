package com.jnu.bottomnavwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
//    , BottomNavigationView.OnNavigationItemSelectedListener

{


    // 나중에 값을 넣는거면 lateinit 이다.
    private lateinit var homeFragment: HomeFragment
    private lateinit var rankingFragment: RankingFragment
    private lateinit var profileFragment: ProfileFragment
    companion object {
        const val TAG: String = "로그"
    }

    // 메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 레이아웃과 연결 (이부분에 해당하는게 프래그먼트에선 onCreateView 이다.)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListener)

        homeFragment = HomeFragment.newInstance()
        // 처음엔 add 로 들어가야한다.
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame, homeFragment).commit()

    }

    // 바텀 내비게이션 아이템 클릭 리스너 설정
    private  val onBottomNavItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    Log.d(TAG, "MainActivity - 홈버튼 클릭")
                    homeFragment = HomeFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, homeFragment).commit()
                }
                R.id.menu_ranking -> {
                    Log.d(TAG, "MainActivity - 랭킹 버튼 클릭")
                    rankingFragment = RankingFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, rankingFragment).commit()
                }
                R.id.menu_profile -> {
                    Log.d(TAG, "MainActivity - 프로필 버튼 클릭")
                    profileFragment = ProfileFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, profileFragment).commit()
                }

            }

            true


        }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        Log.d(TAG, "MainActivity - onNavigationItemSelected() called")

//        when(item.itemId){
//            R.id.menu_home -> {
//                Log.d(TAG,"MainActivity - 홈버튼 클릭")
//            }
//            R.id.menu_ranking -> {
//                Log.d(TAG,"MainActivity - 랭킹 버튼 클릭")
//            }
//            R.id.menu_profile -> {
//                Log.d(TAG,"MainActivity - 프로필 버튼 클릭")
//            }
//
//        }
//
//        return true
//    }

//    }
}
