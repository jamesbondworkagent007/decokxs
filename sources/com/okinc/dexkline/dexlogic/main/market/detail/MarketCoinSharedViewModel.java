package com.okinc.dexkline.dexlogic.main.market.detail;

import androidx.lifecycle.MutableLiveData;
import com.okinc.dexkline.market.features.overview.domain.MarketInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C32299mWw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketCoinSharedViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final String KWHzl = MarketCoinSharedViewModel.class.getSimpleName();
    public final MutableLiveData<C32299mWw> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<MarketInfo> OLrzqt = new MutableLiveData<>();

    @yCM
    public MarketCoinSharedViewModel() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinSharedViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void OLrzqt(@NotNull C32299mWw c32299mWw) {
        Intrinsics.checkNotNullParameter(c32299mWw, "");
        this.AEQbTJ.setValue(c32299mWw);
    }

    public final void OLrzqt(@NotNull MarketInfo marketInfo) {
        Intrinsics.checkNotNullParameter(marketInfo, "");
        this.OLrzqt.setValue(marketInfo);
    }
}
