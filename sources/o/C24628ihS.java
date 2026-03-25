package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LiquidityHeaderBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ihS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24628ihS extends AbstractC33073mpa {
    public final MutableLiveData<java.util.List<LiquidityHeaderBean>> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<java.util.List<LiquidityListItem>> gEmmrt = new MutableLiveData<>();
    public final java.util.ArrayList<LiquidityListItem> EZpvd = new java.util.ArrayList<>();
    public final MutableLiveData<java.lang.Boolean> copydefault = new MutableLiveData<>();
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> KWHzl = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<LiquidityListItem> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<LiquidityHeaderBean>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<LiquidityListItem>> gEmmrt() {
        return this.gEmmrt;
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.postValue(java.lang.Boolean.TRUE);
        AbstractC58185ywX<java.util.List<LiquidityListItem>> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(str).EZpvd(z).EZpvd(str2).copydefault(yBP.AEQbTJ()).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.iia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24628ihS.KWHzl(str, z, str2, this, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<LiquidityListItem>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ihZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24628ihS.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24628ihS.OLrzqt(str, z, this, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ihX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24628ihS.EZpvd(function12, obj);
            }
        }));
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, boolean z, java.lang.String str2, C24628ihS c24628ihS, java.util.List list) {
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(str).EZpvd(z).gEmmrt().copydefault(false);
        InterfaceC22646hjL interfaceC22646hjLGEmmrt = c22380heK.copydefault(str).EZpvd(z).gEmmrt();
        DexMultiTokenInfoBean value = c22380heK.copydefault(str).OLrzqt(z).EZpvd().getValue();
        java.lang.String strCopydefault = C24695iig.copydefault(str2, value != null ? value.getChainId() : null);
        Intrinsics.copydefault(list);
        interfaceC22646hjLGEmmrt.EZpvd(strCopydefault, (java.util.List<LiquidityListItem>) list);
        c24628ihS.copydefault(list);
        MutableLiveData<java.lang.Boolean> mutableLiveData = c24628ihS.copydefault;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableLiveData.postValue(bool);
        if (list.isEmpty()) {
            c24628ihS.KWHzl.postValue(C56390yDp.OLrzqt(4, java.lang.Boolean.TRUE));
        } else {
            c24628ihS.KWHzl.postValue(C56390yDp.OLrzqt(-1, bool));
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, C24628ihS c24628ihS, java.lang.Throwable th) {
        C22380heK.OLrzqt.copydefault(str).EZpvd(z).gEmmrt().copydefault(true);
        c24628ihS.copydefault.postValue(java.lang.Boolean.FALSE);
        c24628ihS.KWHzl.postValue(C56390yDp.OLrzqt(2, java.lang.Boolean.TRUE));
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.util.List<LiquidityListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        for (LiquidityListItem liquidityListItem : list) {
            this.EZpvd.add(new LiquidityListItem(liquidityListItem.getId(), liquidityListItem.getName(), liquidityListItem.getLogo(), liquidityListItem.isSelected()));
        }
        this.AEQbTJ.postValue(EZpvd(this.EZpvd));
    }

    public static final int djBIcL(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int EZpvd(C24628ihS c24628ihS, LiquidityListItem liquidityListItem, LiquidityListItem liquidityListItem2) {
        java.lang.String strValueOf = java.lang.String.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) liquidityListItem.getName()));
        Intrinsics.copydefault(strValueOf, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String strValueOf2 = java.lang.String.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) liquidityListItem2.getName()));
        Intrinsics.copydefault(strValueOf2, "");
        java.lang.String upperCase2 = strValueOf2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return c24628ihS.EZpvd(upperCase, upperCase2);
    }

    public static final int AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int KWHzl(C24628ihS c24628ihS, LiquidityHeaderBean liquidityHeaderBean, LiquidityHeaderBean liquidityHeaderBean2) {
        java.lang.String suspensionTag = liquidityHeaderBean.getSuspensionTag();
        if (suspensionTag == null) {
            suspensionTag = "";
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = suspensionTag.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String suspensionTag2 = liquidityHeaderBean2.getSuspensionTag();
        if (suspensionTag2 == null) {
            suspensionTag2 = "";
        }
        java.lang.String upperCase2 = suspensionTag2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return c24628ihS.EZpvd(upperCase, upperCase2);
    }

    public final boolean valueOf() {
        if (AhwBna()) {
            if (C33129mqd.KWHzl((java.util.Collection) this.gEmmrt.getValue())) {
                java.util.List<LiquidityListItem> value = this.gEmmrt.getValue();
                Intrinsics.copydefault(value);
                java.util.List<LiquidityListItem> list = value;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!((LiquidityListItem) it.next()).isSelected()) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        java.util.ArrayList<LiquidityListItem> arrayList = this.EZpvd;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((LiquidityListItem) it2.next()).isSelected()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean AhwBna() {
        java.lang.String value = this.OLrzqt.getValue();
        return value != null && value.length() > 0;
    }

    public final void AEQbTJ(boolean z) {
        if (AhwBna()) {
            java.util.List<LiquidityListItem> value = this.gEmmrt.getValue();
            if (value != null) {
                java.util.Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    ((LiquidityListItem) it.next()).setSelected(z);
                }
            }
            MutableLiveData<java.util.List<LiquidityListItem>> mutableLiveData = this.gEmmrt;
            mutableLiveData.setValue(mutableLiveData.getValue());
            return;
        }
        java.util.Iterator<T> it2 = this.EZpvd.iterator();
        while (it2.hasNext()) {
            ((LiquidityListItem) it2.next()).setSelected(z);
        }
        MutableLiveData<java.util.List<LiquidityHeaderBean>> mutableLiveData2 = this.AEQbTJ;
        mutableLiveData2.setValue(mutableLiveData2.getValue());
    }

    public final boolean djBIcL() {
        java.util.List<LiquidityListItem> value;
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.getValue()) && ((value = this.gEmmrt.getValue()) == null || value.isEmpty());
    }

    public final java.util.List<LiquidityListItem> OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<LiquidityListItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) ((LiquidityListItem) obj).getName(), (java.lang.CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        final Function2 function2 = new Function2() { // from class: o.ihT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Integer.valueOf(C24628ihS.AEQbTJ(this.AEQbTJ, (LiquidityListItem) obj2, (LiquidityListItem) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.EZpvd(list, new java.util.Comparator() { // from class: o.ihU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                return C24628ihS.OLrzqt(function2, obj2, obj3);
            }
        });
    }

    public static final int AEQbTJ(C24628ihS c24628ihS, LiquidityListItem liquidityListItem, LiquidityListItem liquidityListItem2) {
        java.lang.String name = liquidityListItem.getName();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = name.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = liquidityListItem2.getName().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return c24628ihS.EZpvd(upperCase, upperCase2);
    }

    public static final int OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public final int EZpvd(java.lang.String str, java.lang.String str2) {
        if (AEQbTJ(str) && AEQbTJ(str2)) {
            return C23313hvq.OLrzqt(java.lang.Character.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) str)), java.lang.Character.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) str2))) ? 1 : -1;
        }
        if (AEQbTJ(str) && !AEQbTJ(str2)) {
            return -1;
        }
        if (!AEQbTJ(str2) || AEQbTJ(str)) {
            return Intrinsics.copydefault((int) C59454zhO.zLjUOn((java.lang.CharSequence) str), (int) C59454zhO.zLjUOn((java.lang.CharSequence) str2));
        }
        return 1;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return Pattern.compile("[0-9]*").matcher(java.lang.String.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) str))).matches();
    }

    public final java.util.List<LiquidityHeaderBean> EZpvd(java.util.List<LiquidityListItem> list) {
        java.lang.String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            LiquidityListItem liquidityListItem = (LiquidityListItem) obj;
            if (AEQbTJ(liquidityListItem.getName())) {
                str = "0-9";
            } else {
                java.lang.String upperCase = java.lang.String.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) liquidityListItem.getName())).toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str = upperCase;
            }
            java.lang.Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String upperCase2 = ((java.lang.String) entry.getKey()).toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            final Function2 function2 = new Function2() { // from class: o.ihY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Integer.valueOf(C24628ihS.EZpvd(this.AEQbTJ, (LiquidityListItem) obj2, (LiquidityListItem) obj3));
                }
            };
            arrayList2.add(new LiquidityHeaderBean(true, upperCase2, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(iterable, new java.util.Comparator() { // from class: o.iid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    return C24628ihS.djBIcL(function2, obj2, obj3);
                }
            }))));
        }
        final Function2 function22 = new Function2() { // from class: o.iic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Integer.valueOf(C24628ihS.KWHzl(this.EZpvd, (LiquidityHeaderBean) obj2, (LiquidityHeaderBean) obj3));
            }
        };
        return CollectionsKt___CollectionsKt.EZpvd(arrayList2, new java.util.Comparator() { // from class: o.iie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                return C24628ihS.AEQbTJ(function22, obj2, obj3);
            }
        });
    }

    public final boolean AYXKKw() {
        java.util.ArrayList<LiquidityListItem> arrayList = this.EZpvd;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(!((LiquidityListItem) it.next()).isSelected())) {
                return false;
            }
        }
        return true;
    }
}
