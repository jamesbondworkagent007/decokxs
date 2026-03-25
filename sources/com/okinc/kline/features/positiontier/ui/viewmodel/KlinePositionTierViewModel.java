package com.okinc.kline.features.positiontier.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.C36180oSf;
import o.xBL;
import o.yCM;

/* JADX INFO: loaded from: classes8.dex */
public final class KlinePositionTierViewModel extends AbstractC49411unz<C36180oSf> {
    public final xBL EZpvd;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = xBL.copydefault;

    @yCM
    public KlinePositionTierViewModel() {
        super(new C36180oSf(null, 1, 0 == true ? 1 : 0));
        this.EZpvd = new xBL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.positiontier.ui.viewmodel.KlinePositionTierViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return;
        }
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlinePositionTierViewModel$loadPositionTier$1(this, marketCoinInfo, null), 3, null), "loadPositionTier");
    }

    @Override // o.AbstractC49411unz, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.EZpvd.AYXKKw();
    }
}
