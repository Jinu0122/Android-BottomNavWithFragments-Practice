package com.jnu.bottomnavwithfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RankingFragment : Fragment() {

    // HomeFragment.newInstance()
    // 밖에서 이런식으로 호출하는데 그러면 홈프래그먼트 클레스의 newInstance 가 호출이된다
    // newInstance 는 홈프래그먼트의 라는 자료형을 가지며 홈프래그먼트를 반환한다.

    companion object{
        const val TAG : String = "로그"

        fun newInstance() : RankingFragment{
            return RankingFragment()
        }
    }

    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"RankingFragment - onCreate() called")
    }


    // 엑티비티에 프래그먼트라는 애들이 들어가는데 그럼 프래그먼트가 메인 엑티비티에 붙게된다.
    // 이게 onAttach 이다 이게 프래그먼트랑 엑티비티랑 통신할때 사용되게 된다. 즉 프래그먼트는 엑티비티에 의존하게된다.
    // 즉 프래그먼트를 안고 있는 액티비티에 붙었을 때를 의미한다.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"RankingFragment - onAttach() called")

    }
    // 엑티비티의 onCreate 와 같다.
    // 뷰가 생성되었을 때 화면과 서로 연결해준다.
    // 프래그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        Log.d(TAG,"RankingFragment - onCreateView() called")

        // 레이아웃과 조각을 연결해준다.
        val view = inflater.inflate(R.layout.fragment_ranking, container, false)

        return view
    }

}