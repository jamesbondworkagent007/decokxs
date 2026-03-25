package com.okinc.buysell.ui.entrance;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C31656lzd;
import o.C31943mJr;
import o.C43251rlk;
import o.lyD;
import o.lyR;
import o.sxI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BscSelectorViewModel extends C31943mJr {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final lyR AEQbTJ;
    public final lyD EZpvd;
    public final C31656lzd KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public BscSelectorViewModel(@NotNull lyR lyr, @NotNull lyD lyd, @NotNull C31656lzd c31656lzd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(lyd, "");
        Intrinsics.checkNotNullParameter(c31656lzd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = lyr;
        this.EZpvd = lyd;
        this.KWHzl = c31656lzd;
        this.copydefault = coroutineDispatcher;
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new BscSelectorViewModel$warmupCryptoList$1(((sxI) C43251rlk.copydefault(sxI.class)).AEQbTJ(), this, null), 2, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.entrance.BscSelectorViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
