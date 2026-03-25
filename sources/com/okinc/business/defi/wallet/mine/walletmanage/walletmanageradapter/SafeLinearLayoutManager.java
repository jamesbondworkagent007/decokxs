package com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SafeLinearLayoutManager extends LinearLayoutManager {
    public final InterfaceC56387yDm KWHzl;

    public SafeLinearLayoutManager(Context context) {
        super(context);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SafeLinearLayoutManager.KWHzl();
            }
        });
    }

    public final HashMap<Integer, Integer> AEQbTJ() {
        return (HashMap) this.KWHzl.getValue();
    }

    public static final HashMap KWHzl() {
        return new HashMap();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            pUU.AEQbTJ(String.valueOf(e.getMessage()));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AEQbTJ().put(Integer.valueOf(i), Integer.valueOf(childAt != null ? childAt.getHeight() : 0));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            int iIntValue = -(viewFindViewByPosition != null ? (int) viewFindViewByPosition.getY() : 0);
            for (int i = 0; i < iFindFirstVisibleItemPosition; i++) {
                Integer num = AEQbTJ().get(Integer.valueOf(i));
                iIntValue += num != null ? num.intValue() : 0;
            }
            return iIntValue;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
