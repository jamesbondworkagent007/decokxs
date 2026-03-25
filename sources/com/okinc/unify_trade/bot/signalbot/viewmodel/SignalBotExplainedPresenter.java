package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.bot.data.ExplainContentData;
import com.okinc.unify_trade.bot.data.ExplainTitleData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignalBotExplainedPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public String KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotExplainedPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = true;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotExplainedPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final ArrayList<Object> KWHzl() {
        ArrayList<Object> arrayList = new ArrayList<>();
        String str = this.KWHzl;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1319499034) {
                if (iHashCode != -628372118) {
                    if (iHashCode == 756425099 && str.equals(OtcExtraKeys.CRYPTO_ORDER_TYPE)) {
                        arrayList.add(new ExplainTitleData(C33070mpX.AYXKKw(C55688xof.Application.OsDdEf), 0.0f, 2, null));
                        arrayList.add(new ExplainContentData(C33070mpX.AYXKKw(C55688xof.Application.ZpNRhN)));
                        arrayList.add(new ExplainTitleData(C33070mpX.AYXKKw(C55688xof.Application.asInterface), 16.0f));
                        arrayList.add(new ExplainContentData(C33070mpX.AYXKKw(C55688xof.Application.gezFCt)));
                    }
                } else if (str.equals("out_condition")) {
                    arrayList.add(new ExplainContentData(C33070mpX.AYXKKw(C55688xof.Application.UPzgla)));
                }
            } else if (str.equals("input_condition")) {
                arrayList.add(new ExplainContentData(C33070mpX.AYXKKw(C55688xof.Application.QAQCdZ)));
            }
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
