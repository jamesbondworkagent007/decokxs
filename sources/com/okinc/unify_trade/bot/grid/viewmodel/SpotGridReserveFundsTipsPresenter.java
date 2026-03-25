package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.bot.data.GridTipsItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotGridReserveFundsTipsPresenter extends AbsPresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridReserveFundsTipsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final ArrayList<GridTipsItemData> EZpvd() {
        ArrayList<GridTipsItemData> arrayList = new ArrayList<>();
        arrayList.add(new GridTipsItemData(C33070mpX.AYXKKw(C55688xof.Application.keySet), 12.0f));
        arrayList.add(new GridTipsItemData(C33070mpX.AYXKKw(C55688xof.Application.getRating), 12.0f));
        arrayList.add(new GridTipsItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompatBitmapKey), 12.0f));
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
