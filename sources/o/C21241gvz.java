package o;

import android.content.DialogInterface;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C10525bqB;
import o.C12827cuN;
import o.C13754dXa;
import o.C20599gjt;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21241gvz {
    public static final C21241gvz EZpvd = new C21241gvz();
    public static C8301bAD AEQbTJ = new C8301bAD();
    public static final int OLrzqt = 8;

    private C21241gvz() {
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, long j, long j2, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.lang.String str3, boolean z3, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        OLrzqt(fragmentManager, str, j, j2, str2, z, z2, str3, z3, function1);
    }

    public final void OLrzqt(final androidx.fragment.app.FragmentManager fragmentManager, final java.lang.String str, final long j, final long j2, final java.lang.String str2, final boolean z, final boolean z2, final java.lang.String str3, final boolean z3, final Function1<? super java.lang.String, Unit> function1) {
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j2));
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function12 = new Function1() { // from class: o.gvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21241gvz.KWHzl(objectRef, j2, str, j, map, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C21241gvz.djBIcL(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.gvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21241gvz.EZpvd(z2, arrayList, fragmentManager, str, j, j2, str2, z, str3, function1, map, c10854bwMKWHzl, z3, objectRef, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21241gvz.valueOf(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.gvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21241gvz.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21241gvz.copydefault(function14, obj);
            }
        });
    }

    public static final InterfaceC58261yxu djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu KWHzl(Ref.ObjectRef objectRef, long j, java.lang.String str, long j2, java.util.HashMap map, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(j);
        if (listAYXKKw != null) {
            for (C10525bqB c10525bqB : listAYXKKw) {
                map.put(c10525bqB.zuBGHE(), c10525bqB);
            }
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = AEQbTJ.KWHzl(str, j2, "");
        final Function1 function1 = new Function1() { // from class: o.gvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21241gvz.copydefault((AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.gvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C21241gvz.gEmmrt(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return AEQbTJ.EZpvd();
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(boolean z, java.util.ArrayList arrayList, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, long j2, java.lang.String str2, boolean z2, java.lang.String str3, Function1 function1, java.util.HashMap map, C10854bwM c10854bwM, boolean z3, Ref.ObjectRef objectRef, java.util.List list) {
        C10525bqB c10525bqBAEQbTJ;
        C10525bqB c10525bqB;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressData addressData = (AddressData) it.next();
            if (z) {
                C10525bqB c10525bqB2 = (C10525bqB) map.get(addressData.getAddress());
                if (c10525bqB2 == null) {
                    if (c10854bwM != null) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        T t = objectRef.element;
                        Intrinsics.copydefault(t);
                        c10525bqBAEQbTJ = stateListAnimator.AEQbTJ(c10854bwM, (AbstractC12782ctV) t, addressData.getAddress());
                    } else {
                        c10525bqBAEQbTJ = null;
                    }
                    if (!EZpvd.copydefault(z3, addressData.getAddress(), addressData.isSupported()) && c10525bqBAEQbTJ != null) {
                        arrayList.add(new AddressAggregationData(c10525bqBAEQbTJ.KWHzl().AhwBna(), addressData.getAddress().length() == 0, addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqBAEQbTJ, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqBAEQbTJ, false, 1, null), c10525bqBAEQbTJ.AwvSrB(), c10525bqBAEQbTJ.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqBAEQbTJ.fIwbmz(), c10525bqBAEQbTJ.AhwBna(), c10525bqBAEQbTJ.KWHzl().QfsBiF(), false, false, 24576, null));
                    }
                } else {
                    arrayList.add(new AddressAggregationData(c10525bqB2.KWHzl().AhwBna(), addressData.getAddress().length() == 0, addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB2, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB2, false, 1, null), c10525bqB2.AwvSrB(), c10525bqB2.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB2.fIwbmz(), c10525bqB2.AhwBna(), c10525bqB2.KWHzl().QfsBiF(), false, false, 24576, null));
                }
            } else if (addressData.isSupported() && (c10525bqB = (C10525bqB) map.get(addressData.getAddress())) != null && C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), "0")) {
                arrayList.add(new AddressAggregationData(c10525bqB.KWHzl().AhwBna(), addressData.getAddress().length() == 0, addressData.getAddress(), InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, false, 3, null), InterfaceC9742bbN.TaskDescription.getDisplayCurrencyAmount$default(c10525bqB, false, 1, null), c10525bqB.AwvSrB(), c10525bqB.KWHzl().DbNXlk(), addressData.isSupported(), addressData.getAddressFormat(), addressData.getTipsContent(), c10525bqB.fIwbmz(), c10525bqB.AhwBna(), c10525bqB.KWHzl().QfsBiF(), false, false, 24576, null));
            }
        }
        if (z) {
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, C10530bqG.EZpvd);
            arrayList.clear();
            arrayList.addAll(listEZpvd);
        }
        EZpvd.KWHzl(fragmentManager, str, j, j2, str2, z2, z, str3, (java.util.ArrayList<AddressAggregationData>) arrayList, (Function1<? super java.lang.String, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(boolean z, java.lang.String str, boolean z2) {
        return z && str.length() == 0 && z2;
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, long j, long j2, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, java.util.ArrayList<AddressAggregationData> arrayList, final Function1<? super java.lang.String, Unit> function1) {
        C21226gvk.Companion.KWHzl(j, j2, str, str2, z, z2, arrayList, function1).EZpvd(fragmentManager, str3, new Function1() { // from class: o.gvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21241gvz.AEQbTJ(function1, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void checkTransferAggregationAddressTips$default(C21241gvz c21241gvz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c21241gvz.KWHzl(fragmentManager, str, str2, function0);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C20599gjt.ActionBar actionBar = C20599gjt.Companion;
        if (actionBar.copydefault()) {
            C20599gjt c20599gjtAEQbTJ = actionBar.AEQbTJ(str);
            c20599gjtAEQbTJ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.gvI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C21241gvz.AEQbTJ(function0, dialogInterface);
                }
            });
            c20599gjtAEQbTJ.show(fragmentManager, str2);
            return;
        }
        function0.invoke();
    }

    public static final void AEQbTJ(Function0 function0, android.content.DialogInterface dialogInterface) {
        C20599gjt.Companion.KWHzl(false);
        function0.invoke();
    }
}
