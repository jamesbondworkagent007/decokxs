package com.okinc.business.trade.features.home.meme.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C55276xgr;
import o.C56403yEb;
import o.kKG;
import o.kUU;
import o.kVP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeCurrencySelectionViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<List<C55276xgr>> KWHzl;
    public final kKG OLrzqt;
    public final kUU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<C55276xgr>> OLrzqt() {
        return this.KWHzl;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.meme.viewmodel.MemeCurrencySelectionViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public MemeCurrencySelectionViewModel(@NotNull kUU kuu, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kuu, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.copydefault = kuu;
        this.OLrzqt = kkg;
        this.KWHzl = new MutableLiveData<>();
    }

    public final void EZpvd(int i) {
        this.copydefault.copydefault(i);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault.copydefault(i);
        kVP kvpEZpvd = this.copydefault.EZpvd();
        List<MemeCurrencyBean> listEZpvd = kvpEZpvd.EZpvd(str, str4);
        if (!listEZpvd.isEmpty()) {
            this.KWHzl.setValue(EZpvd(listEZpvd, str3));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeCurrencySelectionViewModel$getCurrencyList$1(kvpEZpvd, str, str2, this, str4, str3, null), 3, null);
    }

    public final List<C55276xgr> EZpvd(List<MemeCurrencyBean> list, String str) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MemeCurrencyBean memeCurrencyBean : list) {
            arrayList.add(new C55276xgr(memeCurrencyBean.getCurrencyTokenInfo().getTokenSymbol(), memeCurrencyBean, memeCurrencyBean.getCurrencyTokenInfo().getTokenName(), Intrinsics.EZpvd((Object) memeCurrencyBean.getCurrencyTokenInfo().getTokenContractAddress(), (Object) str), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        return arrayList;
    }
}
