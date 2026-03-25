package o;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawCoinsViewModel$generateExchangeAssetData$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.Bitmap;
import o.C12827cuN;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21120gtk extends AbstractC33073mpa {
    public AbstractC12782ctV AhwBna;
    public final java.lang.String gEmmrt = C21120gtk.class.getName();
    public final java.util.ArrayList<ExchangeSelectCoinBean> copydefault = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Object> OLrzqt = new java.util.ArrayList<>();
    public final MutableLiveData<Bitmap<java.util.ArrayList<java.lang.Object>>> KWHzl = new MutableLiveData<>();
    public java.lang.String EZpvd = "";
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gtj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21120gtk.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<java.util.ArrayList<java.lang.Object>>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8224ayh djBIcL() {
        return (InterfaceC8224ayh) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8224ayh copydefault() {
        return (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
    }

    public final void EZpvd() {
        this.EZpvd = "";
        OLrzqt(this.copydefault);
    }

    public final boolean OLrzqt() {
        return this.copydefault.size() >= 8;
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just(this.copydefault).observeOn(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.gtu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21120gtk.AEQbTJ(str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58247yxg map = abstractC58247yxgObserveOn.map(new InterfaceC58229yxO() { // from class: o.gtv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C21120gtk.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        AbstractC58247yxg abstractC58247yxgOLrzqt = C33024moe.OLrzqt(map);
        final Function1 function12 = new Function1() { // from class: o.gtt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21120gtk.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gtx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21120gtk.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gtq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21120gtk.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58247yxgOLrzqt.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gtr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21120gtk.djBIcL(function13, obj);
            }
        }));
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C21120gtk c21120gtk, java.util.List list) {
        boolean zIsEmpty = list.isEmpty();
        if (zIsEmpty) {
            c21120gtk.KWHzl.setValue(new Bitmap.StateListAnimator(yDY.copydefault(new C14316djE(null, 0))));
        } else {
            if (zIsEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.copydefault(list);
            c21120gtk.OLrzqt((java.util.List<ExchangeSelectCoinBean>) list);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C21120gtk c21120gtk, java.lang.Throwable th) {
        c21120gtk.KWHzl.setValue(new Bitmap.StateListAnimator(yDY.copydefault(new C14316djE(null, 0))));
        Intrinsics.copydefault(th);
        C56379yDe.AEQbTJ(th);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getWallet$default(this, str, false, new Function1() { // from class: o.gtw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21120gtk.OLrzqt(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(C21120gtk c21120gtk, AbstractC12782ctV abstractC12782ctV) {
        c21120gtk.copydefault(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gtk$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            ExchangeSelectCoinBean exchangeSelectCoinBean = (ExchangeSelectCoinBean) t;
            java.lang.String currency = exchangeSelectCoinBean.getCurrency();
            int i2 = 2;
            if (currency == null || !C59449zhJ.gEmmrt(currency, this.EZpvd, true)) {
                java.lang.String currency2 = exchangeSelectCoinBean.getCurrency();
                if (currency2 == null || !C59449zhJ.AYXKKw(currency2, this.EZpvd, true)) {
                    java.lang.String currency3 = exchangeSelectCoinBean.getCurrency();
                    i = (currency3 == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currency3, (java.lang.CharSequence) this.EZpvd, true)) ? 3 : 2;
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            ExchangeSelectCoinBean exchangeSelectCoinBean2 = (ExchangeSelectCoinBean) t2;
            java.lang.String currency4 = exchangeSelectCoinBean2.getCurrency();
            if (currency4 == null || !C59449zhJ.gEmmrt(currency4, this.EZpvd, true)) {
                java.lang.String currency5 = exchangeSelectCoinBean2.getCurrency();
                if (currency5 == null || !C59449zhJ.AYXKKw(currency5, this.EZpvd, true)) {
                    java.lang.String currency6 = exchangeSelectCoinBean2.getCurrency();
                    if (currency6 == null || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currency6, (java.lang.CharSequence) this.EZpvd, true)) {
                        i2 = 3;
                    }
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            return yET.KWHzl(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WithdrawCoinsViewModel$generateExchangeAssetData$1(this, null), 3, null);
    }

    public final void OLrzqt(java.util.List<ExchangeSelectCoinBean> list) {
        this.OLrzqt.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String str = Intrinsics.EZpvd(((ExchangeSelectCoinBean) next).isSupportWallet(), java.lang.Boolean.TRUE) ? "support" : "noSupport";
            java.lang.Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((java.util.List) arrayList).add(next);
        }
        java.util.List listAhwBna = (java.util.List) linkedHashMap.get("support");
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List listAhwBna2 = (java.util.List) linkedHashMap.get("noSupport");
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        if (C33129mqd.KWHzl((java.util.Collection) listAhwBna)) {
            this.OLrzqt.addAll(listAhwBna);
        }
        if (C33129mqd.KWHzl((java.util.Collection) listAhwBna2)) {
            this.OLrzqt.addAll(listAhwBna2);
        }
        this.KWHzl.setValue(new Bitmap.StateListAnimator(this.OLrzqt));
    }

    public final java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.EZpvd;
        return (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? str : new C17403fEa(ContextCompat.getColor(context, C52761wXj.Activity.fkESqH)).KWHzl(str, this.EZpvd, true);
    }

    public static /* synthetic */ void getWallet$default(C21120gtk c21120gtk, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c21120gtk.copydefault(str, z, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C21120gtk c21120gtk, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        c21120gtk.AhwBna = abstractC12782ctV;
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC12782ctV abstractC12782ctV = this.AhwBna;
        if (abstractC12782ctV == null || z) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
            final Function1 function12 = new Function1() { // from class: o.gtp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21120gtk.copydefault(this.OLrzqt, function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gto
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21120gtk.AYXKKw(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gtn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21120gtk.OLrzqt(function1, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gts
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21120gtk.gEmmrt(function13, obj);
                }
            });
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            return;
        }
        function1.invoke(abstractC12782ctV);
    }

    public final boolean KWHzl(android.view.View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (view.getMeasuredHeight() + i2)) && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }

    public static final java.util.List AEQbTJ(java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.lang.String currency = ((ExchangeSelectCoinBean) obj).getCurrency();
            if (currency != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currency, (java.lang.CharSequence) str, true)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Activity(str));
    }
}
