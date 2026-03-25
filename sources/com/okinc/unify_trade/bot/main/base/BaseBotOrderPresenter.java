package com.okinc.unify_trade.bot.main.base;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C55887xsS;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseBotOrderPresenter extends AbsPresenter {
    public C55887xsS zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.zuBGHE = c55887xsS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBotOrderPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final C55887xsS fvQaOB() {
        C55887xsS c55887xsS = this.zuBGHE;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void EZpvd(Bundle bundle) {
        String string;
        String string2;
        String str = "";
        if (bundle == null || (string = bundle.getString("bot_inst_id")) == null) {
            string = "";
        }
        if (bundle != null && (string2 = bundle.getString("bot_inst_type")) != null) {
            str = string2;
        }
        OLrzqt(new C55887xsS(str, string));
        pUU.EZpvd("USDRename", "init instManager, instType: " + str + ", instId: " + string);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.zuBGHE != null) {
            fvQaOB().KWHzl(str, str2);
        } else {
            OLrzqt(new C55887xsS(str, str2));
        }
    }
}
