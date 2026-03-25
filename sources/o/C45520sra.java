package o;

import com.okinc.okex.center.bean.CoachMarkBean;
import com.okinc.okex.center.bean.HighlightBean;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45520sra implements InterfaceC43234rlT {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.sra$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sra.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("type");
        android.content.Intent intentCopydefault = null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str != null ? str : "";
        if (str2.length() == 0) {
            return;
        }
        try {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) IntegratedSolutionPageType.RecommendationCard.getValue())) {
                intentCopydefault = OLrzqt(context, map);
            } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) IntegratedSolutionPageType.Transaction.getValue())) {
                intentCopydefault = KWHzl(context, map);
            } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) IntegratedSolutionPageType.HotTopic.getValue())) {
                intentCopydefault = EZpvd(context, map);
            } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) IntegratedSolutionPageType.MiniSupport.getValue())) {
                intentCopydefault = copydefault(context, map);
            }
            if (intentCopydefault != null) {
                context.startActivity(intentCopydefault);
            }
        } catch (java.lang.Exception e) {
            pUU.EZpvd("oksupport", "handle deeplink failed==" + e.getMessage());
        }
    }

    public final android.content.Intent OLrzqt(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("title");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.Object obj3 = map.get("slug");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2) || !C33129mqd.OLrzqt((java.lang.CharSequence) str4) || !C33129mqd.OLrzqt((java.lang.CharSequence) str6)) {
            return null;
        }
        java.lang.Object obj4 = map.get("description");
        java.lang.String str7 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.Object obj5 = map.get("dataTrackingKey");
        java.lang.String str9 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        return C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : new RecommendationCard(str2, str9 == null ? "" : str9, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str6, (java.util.List) null, str4, (java.lang.String) null, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Long) null, (SelfServiceToolBean) null, 64860, (DefaultConstructorMarker) null), (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.RecommendationCard);
    }

    public final android.content.Intent KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("transactionType");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object obj3 = map.get("status");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str5 = str4 == null ? "" : str4;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2) || !C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            return null;
        }
        TransactionType transactionType = TransactionType.Deposit;
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) transactionType.getValue())) {
            transactionType = TransactionType.Withdrawal;
            if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) transactionType.getValue())) {
                transactionType = TransactionType.P2P;
                if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) transactionType.getValue())) {
                    transactionType = TransactionType.Unknown;
                }
            }
        }
        TransactionType transactionType2 = transactionType;
        if (transactionType2 == TransactionType.Unknown) {
            return null;
        }
        return C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : new TransactionDisplayModel(str2, transactionType2, (java.lang.String) null, (java.lang.String) null, false, (java.lang.Integer) null, (java.lang.String) null, str5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TransactionTagLabel) null, (java.lang.String) null, (java.util.List) null, (CoachMarkBean) null, (HighlightBean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1048444, (DefaultConstructorMarker) null), (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.Transaction);
    }

    public final android.content.Intent EZpvd(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.Object obj2 = map.get("title");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.Object obj3 = map.get("slug");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2) || !C33129mqd.OLrzqt((java.lang.CharSequence) str4) || !C33129mqd.OLrzqt((java.lang.CharSequence) str6)) {
            return null;
        }
        java.lang.Object obj4 = map.get("description");
        java.lang.String str7 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        return C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : new TopicListItem.TopicItem(str2, str4, str7 == null ? "" : str7, null, null, str6, 24, null), (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.HotTopic);
    }

    public final android.content.Intent copydefault(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map.get("pageId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : str2, IntegratedSolutionPageType.MiniSupport);
        }
        return null;
    }
}
