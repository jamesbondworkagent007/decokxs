package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.BannerInfoNew;
import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.business.defi.wallet.home.banner.BannerViewModel$fetchBannerInfoList$1;
import com.okinc.business.defi.wallet.home.banner.BannerViewModel$forceRefresh$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18028faf extends AbstractC33073mpa {
    public final C18026fad AEQbTJ;
    public final LiveData<InfoListNew> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final MutableLiveData<InfoListNew> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18028faf() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InfoListNew> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:30) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r1v0 o.dbu))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000d: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:31)) : (r2v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.dbu, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:29) call: o.faf.<init>(o.dbu, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C18028faf(C13934dbu c13934dbu, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public C18028faf(@NotNull C13934dbu c13934dbu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = new C18026fad(c13934dbu);
        MutableLiveData<InfoListNew> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.KWHzl = Transformations.distinctUntilChanged(mutableLiveData);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BannerViewModel$forceRefresh$1(this, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BannerViewModel$fetchBannerInfoList$1(this, null), 3, null);
    }

    public final java.util.List<BannerInfoNew> OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        java.util.List<BannerInfoNew> listOLrzqt;
        InfoListNew value = this.copydefault.getValue();
        return (value == null || (listOLrzqt = C18034fal.OLrzqt(value, abstractC12782ctV)) == null) ? yDY.AhwBna() : listOLrzqt;
    }
}
