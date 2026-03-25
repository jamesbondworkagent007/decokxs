package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.campaign.bean.RedirectTarget;
import com.okinc.okex.campaign.bean.RedirectType;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44772sdI extends AbstractC44844seb {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sdG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44772sdI.KWHzl(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.sdI$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RedirectType.values().length];
            try {
                iArr[RedirectType.TASK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RedirectType.LEADERBOARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RedirectType.REWARD_RULES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RedirectType.CAMPAIGN_TC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    public final java.util.List<RedirectTarget> OLrzqt() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List KWHzl(C44772sdI c44772sdI) {
        android.os.Bundle arguments = c44772sdI.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_REDIRECT_LIST") : null;
        java.util.List list = serializable instanceof java.util.List ? (java.util.List) serializable : null;
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        java.lang.String string = getString(C47315tni.PendingIntent.fZBcTu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(2);
        c55198xfS.setSingleOneColumnData(KWHzl(), new yHO() { // from class: o.sdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C44772sdI.AEQbTJ(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C44772sdI c44772sdI, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        C44847see c44847see = objOLrzqt instanceof C44847see ? (C44847see) objOLrzqt : null;
        if (c44847see != null) {
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = c44772sdI.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", c44847see.AEQbTJ())), null, 4, null);
            c44772sdI.EZpvd(c44847see.EZpvd());
        }
        c44772sdI.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str) {
        final java.lang.String str2 = OLrzqt().isEmpty() ^ true ? "true" : "false";
        C45363soQ.onSessionIdEvent$default("SupportCenter_Campaign_EnquiryOption_Click", false, new Function1() { // from class: o.sdL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44772sdI.KWHzl(str, str2, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("enquiry_option", str, true);
        eventParamsList.put("campaign_api_results", str2, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.seb.KWHzl()V */
    public final java.util.List<C55276xgr> KWHzl() {
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_SLUG") : null;
        java.lang.String str = serializable instanceof java.lang.String ? (java.lang.String) serializable : null;
        if (str == null) {
            str = "";
        }
        if (OLrzqt().isEmpty()) {
            java.lang.String string = getString(C47315tni.PendingIntent.djSkpj);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i = C52761wXj.TaskDescription.DzCpqu;
            android.content.Context context = getContext();
            return C56402yEa.EZpvd(new C55276xgr(string, new C44847see(context != null ? C33069mpW.KWHzl(context, C47315tni.PendingIntent.fvQaOB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("urlSlug", str))) : null, FirebaseAnalytics.Event.CAMPAIGN_DETAILS), null, false, false, java.lang.Integer.valueOf(i), null, 92, null));
        }
        return OLrzqt(str, OLrzqt());
    }

    /* JADX INFO: renamed from: o.sdI$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sdI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C44772sdI OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<RedirectTarget> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            C44772sdI c44772sdI = new C44772sdI();
            c44772sdI.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SLUG", str), C56390yDp.OLrzqt("ARG_REDIRECT_LIST", list)));
            return c44772sdI;
        }
    }

    public final java.util.List<C55276xgr> OLrzqt(java.lang.String str, java.util.List<RedirectTarget> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (RedirectTarget redirectTarget : list) {
            int i = ActionBar.copydefault[redirectTarget.getType().ordinal()];
            C55276xgr c55276xgr = null;
            if (i == 1) {
                java.lang.String string = getString(C47315tni.PendingIntent.dvKsVJ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i2 = C52761wXj.TaskDescription.HJWChPhFGucI;
                android.content.Context context = getContext();
                c55276xgr = new C55276xgr(string, new C44847see(context != null ? C33069mpW.KWHzl(context, C47315tni.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("urlSlug", str), C56390yDp.OLrzqt("anchor", redirectTarget.getAnchor()))) : null, "task_progress"), null, false, false, java.lang.Integer.valueOf(i2), null, 92, null);
            } else if (i == 2) {
                java.lang.String string2 = getString(C47315tni.PendingIntent.aKErDB);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                int i3 = C52761wXj.TaskDescription.apNbdB;
                android.content.Context context2 = getContext();
                c55276xgr = new C55276xgr(string2, new C44847see(context2 != null ? C33069mpW.KWHzl(context2, C47315tni.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("urlSlug", str), C56390yDp.OLrzqt("anchor", redirectTarget.getAnchor()))) : null, "ranking"), null, false, false, java.lang.Integer.valueOf(i3), null, 92, null);
            } else if (i == 3) {
                java.lang.String string3 = getString(C47315tni.PendingIntent.dNCPSb);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                int i4 = C52761wXj.TaskDescription.OeawrHOeawrH;
                android.content.Context context3 = getContext();
                c55276xgr = new C55276xgr(string3, new C44847see(context3 != null ? C33069mpW.KWHzl(context3, C47315tni.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("urlSlug", str), C56390yDp.OLrzqt("anchor", redirectTarget.getAnchor()))) : null, "rewards_rules"), null, false, false, java.lang.Integer.valueOf(i4), null, 92, null);
            } else if (i == 4) {
                java.lang.String string4 = getString(C47315tni.PendingIntent.finit);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                int i5 = C52761wXj.TaskDescription.receiveFile;
                android.content.Context context4 = getContext();
                c55276xgr = new C55276xgr(string4, new C44847see(context4 != null ? C33069mpW.KWHzl(context4, C47315tni.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("urlSlug", str), C56390yDp.OLrzqt("anchor", redirectTarget.getAnchor()))) : null, "tnc"), null, false, false, java.lang.Integer.valueOf(i5), null, 92, null);
            }
            if (c55276xgr != null) {
                arrayList.add(c55276xgr);
            }
        }
        return arrayList;
    }
}
