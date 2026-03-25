package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.glide.ImageSize;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.domain.remote.dto.RelatedAuthorInfo;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47959tzu extends AbstractC43310rmq<UnreadMsg, tMS> {
    public final C47925tzM KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX INFO: renamed from: o.tzu$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FollowStatusV2Enum.values().length];
            try {
                iArr[FollowStatusV2Enum.FOLLOWING_EACH_OTHER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.AubY;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, UnreadMsg unreadMsg) {
        onBindViewHolder((C43312rms<tMS>) c43312rms, unreadMsg);
    }

    public C47959tzu(@NotNull C47925tzM c47925tzM) {
        Intrinsics.checkNotNullParameter(c47925tzM, "");
        this.KWHzl = c47925tzM;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47959tzu.EZpvd();
            }
        });
    }

    public static final ImageSize EZpvd() {
        return ImageSize.create(C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final ImageSize KWHzl() {
        return (ImageSize) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMS> c43312rms, @NotNull UnreadMsg unreadMsg) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(unreadMsg, "");
        super.onBindViewHolder((C43312rms) c43312rms, unreadMsg);
        copydefault(c43312rms, unreadMsg);
        updateUnreadHighlight$default(this, c43312rms, this.KWHzl.OLrzqt().contains(java.lang.Long.valueOf(unreadMsg.getMsgId())), null, 4, null);
    }

    public final void AEQbTJ(@NotNull C43312rms<tMS> c43312rms, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(str, KWHzl().getWidth(), KWHzl().getHeight());
        java.lang.String str2 = strKWHzl == null ? "" : strKWHzl;
        android.widget.ImageView imageView = ((tMS) c43312rms.OLrzqt()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadAvatar$default(imageView, str2, null, null, 6, null);
    }

    public final void KWHzl(@NotNull C43312rms<tMS> c43312rms, int i) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        ((tMS) c43312rms.OLrzqt()).AEQbTJ.setImageResource(i);
    }

    public final void KWHzl(@NotNull C43312rms<tMS> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMS) c43312rms.OLrzqt()).AhwBna.setText(str);
    }

    public final void EZpvd(@NotNull C43312rms<tMS> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMS) c43312rms.OLrzqt()).EZpvd.setText(str);
    }

    public final void copydefault(@NotNull C43312rms<tMS> c43312rms, @NotNull UnreadMsg unreadMsg) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(unreadMsg, "");
        java.lang.String localFormatedTime = unreadMsg.getLocalFormatedTime();
        if (localFormatedTime != null && localFormatedTime.length() != 0) {
            ((tMS) c43312rms.OLrzqt()).gEmmrt.setText(unreadMsg.getLocalFormatedTime());
        } else {
            ((tMS) c43312rms.OLrzqt()).gEmmrt.setText(pTA.formatTime$default(new Date(unreadMsg.getEventTime()), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
        }
    }

    public final void EZpvd(@NotNull C43312rms<tMS> c43312rms, boolean z, @NotNull UnreadMsg unreadMsg) {
        java.lang.Float fValueOf;
        java.lang.String strAYXKKw;
        int i;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(unreadMsg, "");
        if (z) {
            ((tMS) c43312rms.OLrzqt()).gEmmrt.setVisibility(8);
            C52794wYp c52794wYp = ((tMS) c43312rms.OLrzqt()).OLrzqt;
            android.content.Context context = c43312rms.itemView.getContext();
            java.util.Iterator it = yDY.gEmmrt(context.getString(C47501trL.Fragment.aHXSQp), context.getString(C47501trL.Fragment.zuWLRA), context.getString(C47501trL.Fragment.akftKQ)).iterator();
            if (it.hasNext()) {
                float fMeasureText = c52794wYp.getPaint().measureText((java.lang.String) it.next());
                while (it.hasNext()) {
                    fMeasureText = java.lang.Math.max(fMeasureText, c52794wYp.getPaint().measureText((java.lang.String) it.next()));
                }
                fValueOf = java.lang.Float.valueOf(fMeasureText);
            } else {
                fValueOf = null;
            }
            c52794wYp.setMinWidth((int) ((fValueOf != null ? fValueOf.floatValue() : 0.0f) + c52794wYp.getPaddingLeft() + c52794wYp.getPaddingRight()));
            FollowStatusV2Enum.Activity activity = FollowStatusV2Enum.Companion;
            RelatedAuthorInfo relatedAuthorInfo = unreadMsg.getRelatedAuthorInfo();
            FollowStatusV2Enum followStatusV2EnumAEQbTJ = activity.AEQbTJ(relatedAuthorInfo != null ? relatedAuthorInfo.getFollowStatusV2() : null);
            int i2 = followStatusV2EnumAEQbTJ == null ? -1 : StateListAnimator.AEQbTJ[followStatusV2EnumAEQbTJ.ordinal()];
            if (i2 == 1 || i2 == 2) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.aHXSQp);
                i = 260;
            } else {
                i = 259;
                if (i2 == 3) {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.zuWLRA);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.akftKQ);
                }
            }
            c52794wYp.setText(strAYXKKw);
            c52794wYp.setOKDSType(i);
            c52794wYp.setVisibility(0);
            return;
        }
        ((tMS) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
        ((tMS) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
    }

    public static /* synthetic */ void updateUnreadHighlight$default(C47959tzu c47959tzu, C43312rms c43312rms, boolean z, UnreadMsg unreadMsg, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUnreadHighlight");
        }
        if ((i & 4) != 0) {
            unreadMsg = null;
        }
        c47959tzu.copydefault(c43312rms, z, unreadMsg);
    }

    public final void copydefault(@NotNull C43312rms<tMS> c43312rms, boolean z, UnreadMsg unreadMsg) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        ConstraintLayout constraintLayout = ((tMS) c43312rms.OLrzqt()).copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (z) {
            constraintLayout.setBackgroundColor(C33070mpX.copydefault(C47501trL.Activity.AEQbTJ));
            return;
        }
        if (unreadMsg != null) {
            this.KWHzl.copydefault(unreadMsg.getMsgId());
        }
        constraintLayout.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.aBDePw));
    }

    public final void KWHzl(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String string = view.getResources().getString(C47501trL.Fragment.OEgNct);
        Intrinsics.checkNotNullExpressionValue(string, "");
        copydefault(view, string);
    }

    public final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String string = view.getResources().getString(C47501trL.Fragment.DDjfYY);
        Intrinsics.checkNotNullExpressionValue(string, "");
        copydefault(view, string);
    }

    public final void copydefault(@NotNull android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(0);
            c55284xgzKWHzl.hDKMBd();
        }
    }
}
