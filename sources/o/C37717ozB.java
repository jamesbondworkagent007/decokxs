package o;

import android.graphics.Color;
import android.graphics.RectF;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.TagColorMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37717ozB {
    public static final java.util.Set<OfficialTagType> AEQbTJ;
    public static final C37717ozB KWHzl = new C37717ozB();
    public static final java.util.Set<OfficialTagType> OLrzqt;
    public static final int copydefault;

    /* JADX INFO: renamed from: o.ozB$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TagColorMode.values().length];
            try {
                iArr[TagColorMode.DARK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TagColorMode.LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[OfficialTagType.values().length];
            try {
                iArr2[OfficialTagType.OfficialGroup.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[OfficialTagType.CommunityOperation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[OfficialTagType.VipManager.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[OfficialTagType.Official.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[OfficialTagType.Beta.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[OfficialTagType.SUPPORT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[OfficialTagType.Vip1.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[OfficialTagType.Vip2.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[OfficialTagType.Vip3.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[OfficialTagType.Vip4.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[OfficialTagType.Vip5.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[OfficialTagType.Vip6.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[OfficialTagType.Vip7.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[OfficialTagType.Vip8.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[OfficialTagType.Vip9.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[OfficialTagType.ROBOT.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[OfficialTagType.PendingRecallVIP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[OfficialTagType.InObserveVip.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[OfficialTagType.InEmergencyVip.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[OfficialTagType.VipRM.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[OfficialTagType.VipSupport.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            copydefault = iArr2;
        }
    }

    private C37717ozB() {
    }

    public static /* synthetic */ java.util.List getSpanStylesByOfficialTagType$default(C37717ozB c37717ozB, android.content.Context context, OfficialTagType officialTagType, TagColorMode tagColorMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            tagColorMode = TagColorMode.NORMAL;
        }
        return c37717ozB.EZpvd(context, officialTagType, tagColorMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final java.util.List<java.lang.Object> EZpvd(android.content.Context context, OfficialTagType officialTagType, TagColorMode tagColorMode) {
        int iCopydefault;
        int i;
        int iCopydefault2;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        int iDpInt$default = C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        RectF rectF = new RectF(C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null));
        int iDp2px$default = C55298xhM.dp2px$default(1.0f, null, 1, null);
        switch (Application.copydefault[officialTagType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int iOLrzqt = OLrzqt(C33070mpX.copydefault(C52761wXj.Activity.gkJEwt), 30);
                int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
                int i3 = Application.EZpvd[tagColorMode.ordinal()];
                if (i3 == 1) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gasjUx);
                } else if (i3 == 2) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gGvvIC);
                } else {
                    i = iCopydefault3;
                    arrayList.add(new oJC(iOLrzqt, i, iDpInt$default, rectF, null, iDp2px$default, false, 80, null));
                    arrayList.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QKVWgx));
                    return arrayList;
                }
                i = iCopydefault;
                arrayList.add(new oJC(iOLrzqt, i, iDpInt$default, rectF, null, iDp2px$default, false, 80, null));
                arrayList.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QKVWgx));
                return arrayList;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                arrayList.add(new oJE(C33070mpX.copydefault(C35399nuc.Application.djBIcL), C33070mpX.copydefault(C35399nuc.Application.djBIcL), 999, rectF, null, iDp2px$default, false, OLrzqt(context, officialTagType), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0.0f, 528, null));
                arrayList.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QKVWgx));
                return arrayList;
            case 16:
                arrayList.add(new oJC(C33070mpX.copydefault(C35399nuc.Application.EZpvd), C33070mpX.copydefault(C32113mPz.ActionBar.EZpvd), iDpInt$default, rectF, null, iDp2px$default, false, 80, null));
                arrayList.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.AubY));
                return arrayList;
            case 17:
            case 18:
            case 19:
                arrayList.add(new oJC(C33070mpX.copydefault(C52761wXj.Activity.aGOrKO), C33070mpX.copydefault(C52761wXj.Activity.aGOrKO), iDpInt$default, rectF, null, iDp2px$default, false, 16, null));
                arrayList.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.ejfBZ));
                return arrayList;
            case 20:
            case 21:
                int iOLrzqt2 = OLrzqt(C33070mpX.copydefault(C52761wXj.Activity.gkJEwt), 30);
                int iCopydefault4 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
                int i4 = Application.EZpvd[tagColorMode.ordinal()];
                if (i4 == 1) {
                    iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.gasjUx);
                } else if (i4 == 2) {
                    iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.gGvvIC);
                } else {
                    i2 = iCopydefault4;
                    arrayList.add(new oJC(iOLrzqt2, i2, iDpInt$default, rectF, null, iDp2px$default, false, 80, null));
                    arrayList.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QKVWgx));
                    return arrayList;
                }
                i2 = iCopydefault2;
                arrayList.add(new oJC(iOLrzqt2, i2, iDpInt$default, rectF, null, iDp2px$default, false, 80, null));
                arrayList.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QKVWgx));
                return arrayList;
            default:
                return arrayList;
        }
    }

    public final int OLrzqt(int i, int i2) {
        return Color.argb((int) (((double) 255) * (((double) i2) / 100.0d)), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final java.lang.String copydefault(OfficialTagType officialTagType) {
        switch (Application.copydefault[officialTagType.ordinal()]) {
            case 1:
            case 2:
            case 4:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.gCZUJG);
            case 3:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.invokespecialgBtXYZ);
            case 5:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.iqMDAV);
            case 6:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hdpuIA);
            case 7:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "1")));
            case 8:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "2")));
            case 9:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "3")));
            case 10:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "4")));
            case 11:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "5")));
            case 12:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, OrderDetailListItem.SLIP_OUT)));
            case 13:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "7")));
            case 14:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "8")));
            case 15:
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.getDefaultImpl), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, "9")));
            case 16:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.SQPLEi);
            case 17:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.ZpNRhN);
            case 18:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.OTwTPd);
            case 19:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.RKcVTr);
            case 20:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.ICustomTabsCallbackStub);
            case 21:
                return C33070mpX.AYXKKw(C35399nuc.LoaderManager.onNavigationEvent);
            default:
                return null;
        }
    }

    public final android.graphics.drawable.Drawable OLrzqt(android.content.Context context, OfficialTagType officialTagType) {
        java.lang.Integer numValueOf;
        switch (Application.copydefault[officialTagType.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                numValueOf = java.lang.Integer.valueOf(C35399nuc.ActionBar.fvQaOB);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return ContextCompat.getDrawable(context, numValueOf.intValue());
        }
        return null;
    }

    static {
        OfficialTagType officialTagType = OfficialTagType.Vip1;
        OfficialTagType officialTagType2 = OfficialTagType.Vip2;
        OfficialTagType officialTagType3 = OfficialTagType.Vip3;
        OfficialTagType officialTagType4 = OfficialTagType.Vip4;
        OfficialTagType officialTagType5 = OfficialTagType.Vip5;
        OfficialTagType officialTagType6 = OfficialTagType.Vip6;
        OfficialTagType officialTagType7 = OfficialTagType.Vip7;
        OfficialTagType officialTagType8 = OfficialTagType.Vip8;
        OfficialTagType officialTagType9 = OfficialTagType.Vip9;
        OfficialTagType officialTagType10 = OfficialTagType.VipRM;
        OfficialTagType officialTagType11 = OfficialTagType.VipSupport;
        AEQbTJ = yEE.AhwBna(officialTagType, officialTagType2, officialTagType3, officialTagType4, officialTagType5, officialTagType6, officialTagType7, officialTagType8, officialTagType9, officialTagType10, officialTagType11);
        OLrzqt = yEE.AhwBna(officialTagType10, officialTagType11);
        copydefault = 8;
    }

    public final void AEQbTJ(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, @NotNull TagColorMode tagColorMode, boolean z, boolean z2, boolean z3) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(tagColorMode, "");
        kotlin.Pair pair = null;
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo != null ? officialTagInfo.getSupportTagTypes() : null;
        if (supportTagTypes == null || supportTagTypes.isEmpty()) {
            AEQbTJ(textView, i);
            return;
        }
        if (z2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : supportTagTypes) {
                if (AEQbTJ.contains((OfficialTagType) obj)) {
                    arrayList.add(obj);
                }
            }
            supportTagTypes = arrayList;
        }
        if (z3) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : supportTagTypes) {
                if (!OLrzqt.contains((OfficialTagType) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            supportTagTypes = arrayList2;
        }
        if (supportTagTypes.isEmpty()) {
            AEQbTJ(textView, i);
            return;
        }
        java.util.Iterator it = supportTagTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OfficialTagType officialTagType = (OfficialTagType) it.next();
            C37717ozB c37717ozB = KWHzl;
            java.lang.String strCopydefault = c37717ozB.copydefault(officialTagType);
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.util.List<java.lang.Object> listEZpvd = c37717ozB.EZpvd(context, officialTagType, tagColorMode);
            kotlin.Pair pairOLrzqt = (strCopydefault == null || !(listEZpvd.isEmpty() ^ true)) ? null : C56390yDp.OLrzqt(strCopydefault, listEZpvd);
            if (pairOLrzqt != null) {
                pair = pairOLrzqt;
                break;
            }
        }
        if (pair != null) {
            java.lang.String str2 = (java.lang.String) pair.component1();
            final java.util.List list = (java.util.List) pair.component2();
            if (z) {
                sb = new java.lang.StringBuilder();
                str = "\u200b";
            } else {
                sb = new java.lang.StringBuilder();
                str = " ";
            }
            sb.append(str);
            sb.append(str2);
            sb.append(str);
            textView.setText(C33061mpO.setupSpanStyles$default(sb.toString(), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.ozz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C37717ozB.EZpvd(list, (java.util.List) obj3);
                }
            }, 14, null));
            textView.setVisibility(0);
            return;
        }
        AEQbTJ(textView, i);
    }

    public static final Unit EZpvd(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        list2.addAll(list);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.widget.TextView textView, int i) {
        textView.setText((java.lang.CharSequence) null);
        textView.setVisibility(i);
    }
}
