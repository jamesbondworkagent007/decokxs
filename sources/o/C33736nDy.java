package o;

import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.OKGroupVoiceCallMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33736nDy {
    public static boolean KWHzl;
    public static final C33736nDy copydefault = new C33736nDy();
    public static final java.util.Map<java.lang.Long, java.lang.Long> AhwBna = new LinkedHashMap();
    public static final java.util.Map<java.lang.Long, ActionBar> valueOf = new LinkedHashMap();
    public static final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final TaskDescription EZpvd = new TaskDescription();
    public static final int OLrzqt = 8;

    private C33736nDy() {
    }

    /* JADX INFO: renamed from: o.nDy$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (C33736nDy.AhwBna.isEmpty() || C33736nDy.valueOf.isEmpty()) {
                C33736nDy c33736nDy = C33736nDy.copydefault;
                C33736nDy.KWHzl = false;
                return;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            for (Map.Entry entry : C33736nDy.valueOf.entrySet()) {
                long jLongValue = ((java.lang.Number) entry.getKey()).longValue();
                ActionBar actionBar = (ActionBar) entry.getValue();
                java.lang.Long l = (java.lang.Long) C33736nDy.AhwBna.get(java.lang.Long.valueOf(jLongValue));
                if (l != null) {
                    long jLongValue2 = l.longValue();
                    pUU.KWHzl("GroupVoiceCallMessageBindHelper", "set totalTime for " + jLongValue);
                    C33736nDy.copydefault.copydefault(jLongValue2, jCurrentTimeMillis, actionBar);
                }
            }
            C33736nDy.AEQbTJ.postDelayed(this, 1000L);
        }
    }

    public final java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        if (Intrinsics.EZpvd((java.lang.Object) oKGroupVoiceCallMessage.getBizName(), (java.lang.Object) OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING)) {
            return context.getString(C35399nuc.LoaderManager.DKtBnz);
        }
        return context.getString(C35399nuc.LoaderManager.fGQ);
    }

    public final AbstractC33969nMo KWHzl(@NotNull AbstractC33969nMo abstractC33969nMo) {
        Intrinsics.checkNotNullParameter(abstractC33969nMo, "");
        android.view.View root = abstractC33969nMo.getRoot();
        ViewGroup.LayoutParams layoutParams = abstractC33969nMo.getRoot().getLayoutParams();
        if (layoutParams != null) {
            C33736nDy c33736nDy = copydefault;
            android.content.Context context = abstractC33969nMo.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.width = c33736nDy.KWHzl(context);
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
        return abstractC33969nMo;
    }

    public final AbstractC33970nMp copydefault(@NotNull AbstractC33970nMp abstractC33970nMp) {
        Intrinsics.checkNotNullParameter(abstractC33970nMp, "");
        android.view.View root = abstractC33970nMp.getRoot();
        ViewGroup.LayoutParams layoutParams = abstractC33970nMp.getRoot().getLayoutParams();
        if (layoutParams != null) {
            C33736nDy c33736nDy = copydefault;
            android.content.Context context = abstractC33970nMp.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.width = c33736nDy.KWHzl(context);
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
        return abstractC33970nMp;
    }

    public static /* synthetic */ void onBindMessageContentView$default(C33736nDy c33736nDy, oAC oac, C35254nrp c35254nrp, OKGroupVoiceCallMessage oKGroupVoiceCallMessage, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        c33736nDy.EZpvd(oac, c35254nrp, oKGroupVoiceCallMessage, l);
    }

    public final void EZpvd(@NotNull oAC<?, ?> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGroupVoiceCallMessage oKGroupVoiceCallMessage, java.lang.Long l) {
        ActionBar actionBarAEQbTJ;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGroupVoiceCallMessage, "");
        ViewDataBinding viewDataBindingEZpvd = oac.EZpvd();
        AbstractC33969nMo abstractC33969nMo = viewDataBindingEZpvd instanceof AbstractC33969nMo ? (AbstractC33969nMo) viewDataBindingEZpvd : null;
        ViewDataBinding viewDataBindingEZpvd2 = oac.EZpvd();
        AbstractC33970nMp abstractC33970nMp = viewDataBindingEZpvd2 instanceof AbstractC33970nMp ? (AbstractC33970nMp) viewDataBindingEZpvd2 : null;
        boolean z = abstractC33970nMp != null;
        if (abstractC33969nMo != null) {
            actionBarAEQbTJ = OLrzqt(abstractC33969nMo);
        } else if (abstractC33970nMp == null) {
            return;
        } else {
            actionBarAEQbTJ = AEQbTJ(abstractC33970nMp);
        }
        ActionBar actionBar = actionBarAEQbTJ;
        GroupVoiceCallData groupVoiceCallData = oKGroupVoiceCallMessage.getGroupVoiceCallData();
        long jValueOf = C33129mqd.valueOf(groupVoiceCallData != null ? groupVoiceCallData.getStartTime() : null);
        GroupVoiceCallData groupVoiceCallData2 = oKGroupVoiceCallMessage.getGroupVoiceCallData();
        long jValueOf2 = C33129mqd.valueOf(groupVoiceCallData2 != null ? groupVoiceCallData2.getEndTime() : null);
        long seq = c35254nrp.OLrzqt().getSeq();
        if (Intrinsics.EZpvd((java.lang.Object) oKGroupVoiceCallMessage.getBizName(), (java.lang.Object) OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING)) {
            OLrzqt(actionBar, seq, oKGroupVoiceCallMessage, java.lang.Long.valueOf(jValueOf), z, l);
        } else {
            android.content.Context context = oac.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            copydefault(actionBar, context, java.lang.Long.valueOf(jValueOf), java.lang.Long.valueOf(jValueOf2), z);
            OLrzqt(seq);
        }
        copydefault(actionBar, oKGroupVoiceCallMessage);
    }

    /* JADX INFO: renamed from: o.nDy$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView AhwBna;
        public final android.view.View EZpvd;
        public final android.view.View KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.view.View valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, android.view.View view, android.widget.ImageView imageView, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                view = actionBar.valueOf;
            }
            if ((i & 2) != 0) {
                imageView = actionBar.AEQbTJ;
            }
            android.widget.ImageView imageView2 = imageView;
            if ((i & 4) != 0) {
                textView = actionBar.copydefault;
            }
            android.widget.TextView textView4 = textView;
            if ((i & 8) != 0) {
                view2 = actionBar.KWHzl;
            }
            android.view.View view4 = view2;
            if ((i & 16) != 0) {
                textView2 = actionBar.OLrzqt;
            }
            android.widget.TextView textView5 = textView2;
            if ((i & 32) != 0) {
                textView3 = actionBar.AhwBna;
            }
            android.widget.TextView textView6 = textView3;
            if ((i & 64) != 0) {
                view3 = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(view, imageView2, textView4, view4, textView5, textView6, view3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull android.view.View view, @NotNull android.widget.ImageView imageView, @NotNull android.widget.TextView textView, @NotNull android.view.View view2, @NotNull android.widget.TextView textView2, @NotNull android.widget.TextView textView3, @NotNull android.view.View view3) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(view2, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            Intrinsics.checkNotNullParameter(textView3, "");
            Intrinsics.checkNotNullParameter(view3, "");
            return new ActionBar(view, imageView, textView, view2, textView2, textView3, view3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.valueOf, actionBar.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, actionBar.AhwBna) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.valueOf.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GroupBindingViews(root=" + this.valueOf + ", callIcon=" + this.AEQbTJ + ", callText=" + this.copydefault + ", joinBtn=" + this.KWHzl + ", callTime=" + this.OLrzqt + ", joinedText=" + this.AhwBna + ", callContainer=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull android.view.View view, @NotNull android.widget.ImageView imageView, @NotNull android.widget.TextView textView, @NotNull android.view.View view2, @NotNull android.widget.TextView textView2, @NotNull android.widget.TextView textView3, @NotNull android.view.View view3) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(view2, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            Intrinsics.checkNotNullParameter(textView3, "");
            Intrinsics.checkNotNullParameter(view3, "");
            this.valueOf = view;
            this.AEQbTJ = imageView;
            this.copydefault = textView;
            this.KWHzl = view2;
            this.OLrzqt = textView2;
            this.AhwBna = textView3;
            this.EZpvd = view3;
        }
    }

    public final ActionBar OLrzqt(AbstractC33969nMo abstractC33969nMo) {
        android.view.View root = abstractC33969nMo.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        android.widget.ImageView imageView = abstractC33969nMo.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.TextView textView = abstractC33969nMo.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C52794wYp c52794wYp = abstractC33969nMo.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        android.widget.TextView textView2 = abstractC33969nMo.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.TextView textView3 = abstractC33969nMo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        ConstraintLayout constraintLayout = abstractC33969nMo.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return new ActionBar(root, imageView, textView, c52794wYp, textView2, textView3, constraintLayout);
    }

    public final ActionBar AEQbTJ(AbstractC33970nMp abstractC33970nMp) {
        android.view.View root = abstractC33970nMp.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        android.widget.ImageView imageView = abstractC33970nMp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.TextView textView = abstractC33970nMp.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C52794wYp c52794wYp = abstractC33970nMp.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        android.widget.TextView textView2 = abstractC33970nMp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.TextView textView3 = abstractC33970nMp.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        ConstraintLayout constraintLayout = abstractC33970nMp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return new ActionBar(root, imageView, textView, c52794wYp, textView2, textView3, constraintLayout);
    }

    public final void OLrzqt(ActionBar actionBar, long j, OKGroupVoiceCallMessage oKGroupVoiceCallMessage, java.lang.Long l, boolean z, java.lang.Long l2) {
        android.widget.Button button;
        actionBar.AEQbTJ().setImageResource(z ? C35399nuc.ActionBar.hUfVAv : C35399nuc.ActionBar.giSNqX);
        actionBar.EZpvd().setBackground(AppCompatResources.getDrawable(actionBar.djBIcL().getContext(), z ? C35399nuc.ActionBar.fetchVPNInfo : C35399nuc.ActionBar.AkhnZx));
        actionBar.KWHzl().setText(actionBar.djBIcL().getContext().getString(C35399nuc.LoaderManager.DKtBnz));
        actionBar.OLrzqt().setVisibility(0);
        if (EZpvd(oKGroupVoiceCallMessage, l2)) {
            android.view.View viewOLrzqt = actionBar.OLrzqt();
            button = viewOLrzqt instanceof android.widget.Button ? (android.widget.Button) viewOLrzqt : null;
            if (button != null) {
                button.setText(actionBar.djBIcL().getContext().getString(C35399nuc.LoaderManager.iCPUKe));
            }
            actionBar.OLrzqt().setEnabled(false);
        } else {
            android.view.View viewOLrzqt2 = actionBar.OLrzqt();
            button = viewOLrzqt2 instanceof android.widget.Button ? (android.widget.Button) viewOLrzqt2 : null;
            if (button != null) {
                button.setText(actionBar.djBIcL().getContext().getString(C35399nuc.LoaderManager.gtdfxv));
            }
            actionBar.OLrzqt().setEnabled(true);
        }
        if (l != null && l.longValue() > 0) {
            AhwBna.put(java.lang.Long.valueOf(j), l);
            valueOf.put(java.lang.Long.valueOf(j), actionBar);
            if (!KWHzl) {
                KWHzl = true;
                AEQbTJ.post(EZpvd);
            }
            copydefault(l.longValue(), java.lang.System.currentTimeMillis(), actionBar);
            return;
        }
        pUU.KWHzl("GroupVoiceCallMessageBindHelper", "Invalid startTime for seq " + j);
        actionBar.copydefault().setText("00:00");
    }

    public final void copydefault(ActionBar actionBar, android.content.Context context, java.lang.Long l, java.lang.Long l2, boolean z) {
        if (l != null && l2 != null && l2.longValue() > l.longValue()) {
            copydefault(l.longValue(), l2.longValue(), actionBar);
        } else {
            actionBar.copydefault().setText("00:00");
        }
        actionBar.AEQbTJ().setImageResource(z ? C35399nuc.ActionBar.gkJEwt : C35399nuc.ActionBar.gasjUx);
        actionBar.EZpvd().setBackground(AppCompatResources.getDrawable(actionBar.djBIcL().getContext(), z ? C35399nuc.ActionBar.fetchVPNInfo : C35399nuc.ActionBar.AkhnZx));
        actionBar.KWHzl().setText(context.getString(C35399nuc.LoaderManager.fGQ));
        actionBar.OLrzqt().setVisibility(8);
    }

    public final void copydefault(ActionBar actionBar, OKGroupVoiceCallMessage oKGroupVoiceCallMessage) {
        java.util.List historicalUids;
        java.lang.String string;
        GroupVoiceCallData groupVoiceCallData = oKGroupVoiceCallMessage.getGroupVoiceCallData();
        if (groupVoiceCallData != null) {
            java.lang.Integer numValueOf = (!Intrinsics.EZpvd((java.lang.Object) oKGroupVoiceCallMessage.getBizName(), (java.lang.Object) OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING) ? (historicalUids = groupVoiceCallData.getHistoricalUids()) != null : (historicalUids = groupVoiceCallData.getActiveUsers()) != null) ? null : java.lang.Integer.valueOf(historicalUids.size());
            if (numValueOf == null || (string = numValueOf.toString()) == null) {
                string = "0";
            }
            actionBar.gEmmrt().setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DLGVGj), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", string))));
            return;
        }
        actionBar.gEmmrt().setText("");
    }

    public final void copydefault(long j, long j2, ActionBar actionBar) {
        int i = (int) ((j2 - j) / ((long) 1000));
        android.widget.TextView textViewCopydefault = actionBar.copydefault();
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i / 60), java.lang.Integer.valueOf(i % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        textViewCopydefault.setText(str);
    }

    public final boolean EZpvd(OKGroupVoiceCallMessage oKGroupVoiceCallMessage, java.lang.Long l) {
        GroupVoiceCallData groupVoiceCallData;
        java.util.List<GroupVoiceCallUser> activeUsers;
        if (l == null || (groupVoiceCallData = oKGroupVoiceCallMessage.getGroupVoiceCallData()) == null || (activeUsers = groupVoiceCallData.getActiveUsers()) == null || activeUsers.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = activeUsers.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd(((GroupVoiceCallUser) it.next()).getAgoraUid(), l)) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd(long j) {
        java.util.Map<java.lang.Long, ActionBar> map = valueOf;
        map.remove(java.lang.Long.valueOf(j));
        if (map.isEmpty()) {
            KWHzl = false;
            AEQbTJ.removeCallbacks(EZpvd);
        }
    }

    public final void OLrzqt(long j) {
        java.util.Map<java.lang.Long, java.lang.Long> map = AhwBna;
        map.remove(java.lang.Long.valueOf(j));
        valueOf.remove(java.lang.Long.valueOf(j));
        if (map.isEmpty()) {
            KWHzl = false;
            AEQbTJ.removeCallbacks(EZpvd);
        }
    }

    public final void KWHzl() {
        AhwBna.clear();
        valueOf.clear();
        KWHzl = false;
        AEQbTJ.removeCallbacks(EZpvd);
    }

    public final int KWHzl(android.content.Context context) {
        return C56548yJl.EZpvd(yII.EZpvd(C33566myq.EZpvd.EZpvd(context) * 0.65f), C55298xhM.dp2px$default(220.0f, null, 1, null), C55298xhM.dp2px$default(260.0f, null, 1, null));
    }
}
