package com.edu.zum.easyapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.edu.zum.easyapp.R;
import com.edu.zum.easyapp.model.BookBean;

/**
 * Created by lwh on 2016/8/1.
 */
public class BookAdapter extends BaseRecyclerAdapter<BookBean> {
    @Override
    protected int setItemLayoutResourceID() {
        return R.layout.layout_book_item;
    }

    @Override
    protected BaseViewHolder setViewHolder(View v, int viewType, ViewGroup parent) {
        return new BaseViewHolder(v);
    }

    @Override
    protected void onBindMyViewHolder(BaseViewHolder holder, int position) {
        holder.setImageResource(R.id.book_iv, mDatas.get(position).getResId());
        holder.setOnClickListener(R.id.book_iv, new OnRecyclerItemChildClickListener(), position);
    }

}
