package o;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17671fNz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17412fEj {
    public static boolean EZpvd;
    public float AEQbTJ;
    public float KWHzl = 1.0f;
    public boolean copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.fEj$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(float f) {
        this.AEQbTJ = f;
    }

    public final int EZpvd(boolean z) {
        return z ? 0 : 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return !EZpvd;
    }

    public final int copydefault(boolean z) {
        return z ? 0 : 4;
    }

    @yCM
    public C17412fEj() {
    }

    /* JADX INFO: renamed from: o.fEj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fEj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean KWHzl() {
            return C17412fEj.EZpvd;
        }

        public final void OLrzqt(boolean z) {
            C17412fEj.EZpvd = z;
        }
    }

    public final java.lang.String AYXKKw(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return abstractC12784ctX.AuCTel();
    }

    public final java.lang.String djBIcL(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        java.lang.String strEjfBZ = abstractC12784ctX.ejfBZ();
        return C13821dZn.EZpvd.OLrzqt(C54880xYt.formatValuationFromAsset$default(strEjfBZ, null, false, C14455dll.KWHzl.copydefault(strEjfBZ), false, 11, null));
    }

    public final int copydefault(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return EZpvd(abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet || abstractC12784ctX.fJNWhG() == WalletType.HardwareWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet);
    }

    public final boolean EZpvd(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.HardwareWallet || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet;
    }

    public final boolean KWHzl(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        if (abstractC12784ctX.fJNWhG() == WalletType.DemoWallet) {
            return true;
        }
        try {
            return SPUtils.getBoolean(AhwBna(abstractC12784ctX), true);
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public final java.lang.String AhwBna(AbstractC12784ctX abstractC12784ctX) {
        return abstractC12784ctX.EZpvd() + "-open";
    }

    public final boolean gEmmrt(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return SPUtils.commit(AhwBna(abstractC12784ctX), java.lang.Boolean.valueOf(!KWHzl(abstractC12784ctX)));
    }

    public final java.lang.String copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return abstractC12782ctV.AkhnZx();
    }

    public final int EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return (!abstractC12782ctV.DCUTEIdCUTEI() || this.copydefault) ? 8 : 0;
    }

    public final java.lang.String OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.lang.String strUlJrfe = abstractC12782ctV.UlJrfe();
        return C13821dZn.EZpvd.OLrzqt(C54880xYt.formatValuationFromAsset$default(strUlJrfe, null, false, C14455dll.KWHzl.copydefault(strUlJrfe), false, 11, null));
    }

    public final boolean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        int i = ActionBar.OLrzqt[abstractC12782ctV.QwvEab().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i != 5) {
                return true;
            }
            if (!abstractC12782ctV.AEQbTJ(WalletType.HDWallet) && !abstractC12782ctV.AEQbTJ(WalletType.MPCWallet) && !abstractC12782ctV.AEQbTJ(WalletType.HardwareWallet)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(@NotNull AbstractC12784ctX abstractC12784ctX) {
        java.util.Collection collectionAhwBna;
        java.util.Collection collectionAhwBna2;
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        if (EZpvd) {
            return false;
        }
        int i = ActionBar.OLrzqt[abstractC12784ctX.fJNWhG().ordinal()];
        if (i == 1) {
            return abstractC12784ctX.AEQbTJ();
        }
        if (i == 2) {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            java.util.List<AbstractC12782ctV> listFIwbmz = abstractC12784ctX.fIwbmz();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : listFIwbmz) {
                java.lang.String str = ((AbstractC12782ctV) obj).QwvEab() == WalletType.AAWallet ? "AA" : "Normal";
                java.lang.Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            java.util.List list = (java.util.List) linkedHashMap.get("AA");
            if (list == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!((AbstractC12782ctV) obj2).DCUTEIdCUTEI()) {
                        collectionAhwBna.add(obj2);
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(collectionAhwBna, 10));
            java.util.Iterator it = collectionAhwBna.iterator();
            while (it.hasNext()) {
                ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it.next()).valueOf());
                arrayList2.add(chainAddress != null ? chainAddress.getEoaAddress() : null);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                java.lang.String str2 = (java.lang.String) obj3;
                if (!(str2 == null || str2.length() == 0)) {
                    arrayList3.add(obj3);
                }
            }
            java.util.List listAhwBna = (java.util.List) linkedHashMap.get("Normal");
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            if (listAhwBna.size() <= 1) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna);
                java.lang.String strEZpvd = abstractC12782ctV != null ? abstractC12782ctV.EZpvd(jFetchVPNInfo) : null;
                if (abstractC12782ctV == null) {
                    return false;
                }
                if ((!abstractC12782ctV.Dmq() && abstractC12782ctV.zLjUOn()) || arrayList3.contains(strEZpvd) || abstractC12782ctV.DCUTEIdCUTEI()) {
                    return false;
                }
                if (!C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd != null ? strEZpvd : "")) {
                    return false;
                }
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : listAhwBna) {
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj4;
                    if (abstractC12782ctV2.ORxRYg() && (abstractC12782ctV2.Dmq() || !abstractC12782ctV2.zLjUOn())) {
                        if (!abstractC12782ctV2.DCUTEIdCUTEI()) {
                            arrayList4.add(obj4);
                        }
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj5 : arrayList4) {
                    java.lang.String strEZpvd2 = ((AbstractC12782ctV) obj5).EZpvd(jFetchVPNInfo);
                    if (!arrayList3.contains(strEZpvd2) && C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd2)) {
                        arrayList5.add(obj5);
                    }
                }
                if (arrayList5.isEmpty()) {
                    return false;
                }
            }
        } else if (i != 3) {
            if (i != 6) {
                return false;
            }
            java.util.List<AbstractC12782ctV> listFIwbmz2 = abstractC12784ctX.fIwbmz();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (java.lang.Object obj6 : listFIwbmz2) {
                java.lang.String str3 = ((AbstractC12782ctV) obj6).QwvEab() == WalletType.AAWallet ? "AA" : "Normal";
                java.lang.Object arrayList6 = linkedHashMap2.get(str3);
                if (arrayList6 == null) {
                    arrayList6 = new java.util.ArrayList();
                    linkedHashMap2.put(str3, arrayList6);
                }
                ((java.util.List) arrayList6).add(obj6);
            }
            java.util.List listAhwBna2 = (java.util.List) linkedHashMap2.get("AA");
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            java.util.List list2 = (java.util.List) linkedHashMap2.get("Normal");
            if (list2 == null) {
                collectionAhwBna2 = yDY.AhwBna();
            } else {
                collectionAhwBna2 = new java.util.ArrayList();
                for (java.lang.Object obj7 : list2) {
                    if (((AbstractC12782ctV) obj7).dUDNAs()) {
                        collectionAhwBna2.add(obj7);
                    }
                }
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
            java.util.Iterator it2 = listAhwBna2.iterator();
            while (it2.hasNext()) {
                ChainAddress chainAddress2 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it2.next()).valueOf());
                arrayList7.add(chainAddress2 != null ? chainAddress2.getEoaAddress() : null);
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            for (java.lang.Object obj8 : arrayList7) {
                java.lang.String str4 = (java.lang.String) obj8;
                if (!(str4 == null || str4.length() == 0)) {
                    arrayList8.add(obj8);
                }
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            for (java.lang.Object obj9 : collectionAhwBna2) {
                if (((AbstractC12782ctV) obj9).AuCTelauCTel()) {
                    arrayList9.add(obj9);
                }
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            for (java.lang.Object obj10 : arrayList9) {
                AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) obj10;
                C10854bwM c10854bwMIsConnected2 = C10954byG.EZpvd.valueOf().isConnected();
                java.lang.String strEZpvd3 = abstractC12782ctV3.EZpvd(c10854bwMIsConnected2 != null ? c10854bwMIsConnected2.fetchVPNInfo() : -1L);
                if (!arrayList8.contains(strEZpvd3) && C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd3)) {
                    arrayList10.add(obj10);
                }
            }
            if (arrayList10.isEmpty()) {
                return false;
            }
        } else if (!abstractC12784ctX.getFieldNames() && !abstractC12784ctX.zsXlph() && !abstractC12784ctX.uzCIH()) {
            java.util.List<AbstractC12782ctV> listFIwbmz3 = abstractC12784ctX.fIwbmz();
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            for (java.lang.Object obj11 : listFIwbmz3) {
                AbstractC12782ctV abstractC12782ctV4 = (AbstractC12782ctV) obj11;
                if (abstractC12782ctV4.QwvEab() == WalletType.HardwareWallet && abstractC12782ctV4.dUDNAs()) {
                    arrayList11.add(obj11);
                }
            }
            if (arrayList11.isEmpty()) {
                return false;
            }
            java.util.List<AbstractC12782ctV> listFIwbmz4 = abstractC12784ctX.fIwbmz();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            for (java.lang.Object obj12 : listFIwbmz4) {
                if (((AbstractC12782ctV) obj12).QwvEab() == WalletType.AAWallet) {
                    arrayList12.add(obj12);
                }
            }
            java.util.ArrayList arrayList13 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList12, 10));
            java.util.Iterator it3 = arrayList12.iterator();
            while (it3.hasNext()) {
                ChainAddress chainAddress3 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it3.next()).valueOf());
                arrayList13.add(chainAddress3 != null ? chainAddress3.getEoaAddress() : null);
            }
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            for (java.lang.Object obj13 : arrayList13) {
                java.lang.String str5 = (java.lang.String) obj13;
                if (!(str5 == null || str5.length() == 0)) {
                    arrayList14.add(obj13);
                }
            }
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            for (java.lang.Object obj14 : arrayList11) {
                if (((AbstractC12782ctV) obj14).AuCTelauCTel()) {
                    arrayList15.add(obj14);
                }
            }
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            for (java.lang.Object obj15 : arrayList15) {
                AbstractC12782ctV abstractC12782ctV5 = (AbstractC12782ctV) obj15;
                if (!arrayList14.contains(abstractC12782ctV5.EZpvd(C10954byG.EZpvd.valueOf().isConnected() != null ? r8.fetchVPNInfo() : -1L))) {
                    arrayList16.add(obj15);
                }
            }
            if (arrayList16.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String AEQbTJ(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        int i = ActionBar.OLrzqt[abstractC12784ctX.fJNWhG().ordinal()];
        if (i == 1 || i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasEnabledCallbacks);
        }
        if (i != 3) {
            return i != 6 ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.ahrCSq);
        }
        if (abstractC12784ctX.getFieldNames() || abstractC12784ctX.zsXlph() || abstractC12784ctX.uzCIH()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasEnabledCallbacks);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ahrCSq);
    }

    public final boolean valueOf(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return !abstractC12784ctX.AEQbTJ();
    }

    public final int KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return EZpvd((abstractC12782ctV.QwvEab() == WalletType.HDWallet || abstractC12782ctV.QwvEab() == WalletType.MPCWallet || abstractC12782ctV.QwvEab() == WalletType.HardwareWallet || abstractC12782ctV.QwvEab() == WalletType.TonWallet || !(abstractC12782ctV.QwvEab() != WalletType.AAWallet || (abstractC12782ctV.DarRvM() != WalletType.HDWallet && abstractC12782ctV.DarRvM() != WalletType.HardwareWallet && abstractC12782ctV.DarRvM() != WalletType.MPCWallet))) ? false : true);
    }

    public final void EZpvd(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        float fDp2px$default = (1 - this.KWHzl) * C55298xhM.dp2px$default(8.0f, null, 1, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fDp2px$default, fDp2px$default, fDp2px$default, fDp2px$default, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(C33070mpX.copydefault(C52761wXj.Activity.copydefault));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(constraintLayout.getWidth());
        shapeDrawable.setIntrinsicHeight(constraintLayout.getHeight());
        constraintLayout.setBackground(shapeDrawable);
    }
}
