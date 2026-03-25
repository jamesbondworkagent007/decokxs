package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.bean.CustomNetworkConfig;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16162eei extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public java.lang.String AYXKKw;
    public final LiveData<java.util.List<CustomChainMeta>> EZpvd;
    public final C10598brV KWHzl;
    public final MutableLiveData<java.util.List<CustomChainMeta>> OLrzqt;
    public final java.util.List<CustomChainMeta> copydefault;
    public final MutableLiveData<java.lang.Boolean> djBIcL;
    public final C13934dbu valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData EZpvd(ResponseData responseData, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(bool, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<CustomChainMeta>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.dbu)
  (wrap:o.brV:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.brV:0x0004: SGET  A[WRAPPED] (LINE:15) o.brV.AEQbTJ o.brV) : (r2v0 o.brV))
 A[MD:(o.dbu, o.brV):void (m)] (LINE:13) call: o.eei.<init>(o.dbu, o.brV):void type: THIS */
    public /* synthetic */ C16162eei(C13934dbu c13934dbu, C10598brV c10598brV, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13934dbu, (i & 2) != 0 ? C10598brV.AEQbTJ : c10598brV);
    }

    public C16162eei(@NotNull C13934dbu c13934dbu, @NotNull C10598brV c10598brV) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        this.valueOf = c13934dbu;
        this.KWHzl = c10598brV;
        MutableLiveData<java.util.List<CustomChainMeta>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.EZpvd = mutableLiveData;
        this.copydefault = new java.util.ArrayList();
        this.djBIcL = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
    }

    public final void copydefault(final int i) {
        if (i == 2) {
            AEQbTJ(this.KWHzl.DbNXlk(), i);
            return;
        }
        AbstractC58185ywX<ResponseData<CustomNetworkConfig>> abstractC58185ywXValues = this.valueOf.values();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = this.KWHzl.EZpvd(true);
        final Function2 function2 = new Function2() { // from class: o.eej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C16162eei.EZpvd((ResponseData) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXValues, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.eek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C16162eei.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.eeo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16162eei.EZpvd(this.KWHzl, i, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16162eei.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.een
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16162eei.KWHzl(this.copydefault, i, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16162eei.AEQbTJ(function12, obj);
            }
        }));
    }

    public static final ResponseData KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C16162eei c16162eei, int i, ResponseData responseData) {
        c16162eei.AEQbTJ(c16162eei.KWHzl.DbNXlk(), i);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C16162eei c16162eei, int i, java.lang.Throwable th) {
        c16162eei.AEQbTJ(c16162eei.KWHzl.DbNXlk(), i);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<CustomChainMeta> list, int i) {
        java.util.List<CustomChainMeta> listOLrzqt;
        java.lang.String str;
        this.copydefault.clear();
        this.copydefault.addAll(list);
        java.lang.String str2 = this.AYXKKw;
        if (str2 == null || str2.length() == 0) {
            listOLrzqt = this.copydefault;
        } else {
            java.lang.String str3 = this.AYXKKw;
            if (str3 == null) {
                str3 = "";
            }
            listOLrzqt = OLrzqt(str3);
        }
        java.util.List<CustomChainMeta> listAEQbTJ = AEQbTJ(i, listOLrzqt);
        this.OLrzqt.setValue(listAEQbTJ);
        this.djBIcL.setValue(java.lang.Boolean.valueOf(listAEQbTJ.size() >= 10 || !((str = this.AYXKKw) == null || str.length() == 0)));
        this.AEQbTJ.setValue(java.lang.Boolean.valueOf(listAEQbTJ.isEmpty()));
    }

    public final void OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        java.util.List<CustomChainMeta> listAEQbTJ = str.length() == 0 ? this.copydefault : AEQbTJ(i, OLrzqt(str));
        this.OLrzqt.setValue(AEQbTJ(i, listAEQbTJ));
        this.AEQbTJ.setValue(java.lang.Boolean.valueOf(listAEQbTJ.isEmpty()));
    }

    public final java.util.List<CustomChainMeta> AEQbTJ(int i, java.util.List<CustomChainMeta> list) {
        java.util.ArrayList arrayList;
        if (i != 1) {
            if (i == 2) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((CustomChainMeta) obj).AhwBna()) {
                        arrayList.add(obj);
                    }
                }
            }
            return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        }
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!((CustomChainMeta) obj2).AhwBna()) {
                arrayList.add(obj2);
            }
        }
        list = arrayList;
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
    }

    public final java.util.List<CustomChainMeta> OLrzqt(java.lang.String str) {
        java.util.List<CustomChainMeta> list = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((CustomChainMeta) obj).OLrzqt(), (java.lang.CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
