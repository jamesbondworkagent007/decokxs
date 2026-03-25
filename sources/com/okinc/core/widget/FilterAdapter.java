package com.okinc.core.widget;

import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import o.C43271rmD;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public abstract class FilterAdapter extends C43271rmD<RecyclerView.ViewHolder> implements Filterable {

    public enum MatchPattern {
        START_WITH,
        END_WITH,
        CONTAINS,
        CONTAINS_OR_START_WITH_PINYIN
    }
}
