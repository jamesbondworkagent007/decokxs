package com.okinc.unify_trade.bot.dcd.presenter;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdRecommendPresenter extends AbsPresenter {
    public ArrayList<TacticsInsideItemData> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsInsideItemData> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdRecommendPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(Bundle bundle) {
        ArrayList<TacticsInsideItemData> parcelableArrayList;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("bot_dcd_recommend_data", TacticsInsideItemData.class) : null;
        } else if (bundle != null) {
            parcelableArrayList = bundle.getParcelableArrayList("bot_dcd_recommend_data");
        }
        this.EZpvd = parcelableArrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
