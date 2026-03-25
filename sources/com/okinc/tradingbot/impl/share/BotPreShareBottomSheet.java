package com.okinc.tradingbot.impl.share;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33512mxp;
import o.C48033uCm;
import o.C48342uNy;
import o.C52761wXj;
import o.C52794wYp;
import o.C53769wrj;
import o.C55296xhK;
import o.C55353xiO;
import o.C56390yDp;
import o.C56392yDr;
import o.C6697aUI;
import o.InterfaceC56387yDm;
import o.wXQ;
import o.wXX;
import o.wYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotPreShareBottomSheet extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public SimpleExoPlayer AEQbTJ;
    public Player.EventListener AYXKKw;
    public C48342uNy KWHzl;
    public Function0<Unit> OLrzqt;
    public Function1<? super TacticsData, Unit> valueOf;
    public final boolean copydefault = true;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wqG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BotPreShareBottomSheet.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.share.BotPreShareBottomSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.share.BotPreShareBottomSheet$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BotPreShareBottomSheet newInstance$default(ActionBar actionBar, UiParam uiParam, Function1 function1, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return actionBar.OLrzqt(uiParam, function1, function0);
        }

        public final BotPreShareBottomSheet OLrzqt(@NotNull UiParam uiParam, @NotNull Function1<? super TacticsData, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(uiParam, "");
            Intrinsics.checkNotNullParameter(function1, "");
            BotPreShareBottomSheet botPreShareBottomSheet = new BotPreShareBottomSheet();
            botPreShareBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_ui_param", uiParam)));
            botPreShareBottomSheet.valueOf = function1;
            botPreShareBottomSheet.OLrzqt = function0;
            return botPreShareBottomSheet;
        }
    }

    public final UiParam EZpvd() {
        return (UiParam) this.AhwBna.getValue();
    }

    public static final UiParam AEQbTJ(BotPreShareBottomSheet botPreShareBottomSheet) {
        Object parcelable;
        Bundle arguments = botPreShareBottomSheet.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("arg_ui_param", UiParam.class);
        } else {
            Object parcelable2 = arguments.getParcelable("arg_ui_param");
            parcelable = (UiParam) (parcelable2 instanceof UiParam ? parcelable2 : null);
        }
        return (UiParam) parcelable;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C48342uNy c48342uNyOLrzqt = C48342uNy.OLrzqt(getLayoutInflater(), constraintLayout, true);
        UiParam uiParamEZpvd = EZpvd();
        if (uiParamEZpvd != null) {
            c48342uNyOLrzqt.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC)));
            c48342uNyOLrzqt.djBIcL.setText(uiParamEZpvd.AEQbTJ());
            c48342uNyOLrzqt.copydefault.AEQbTJ(uiParamEZpvd.djBIcL());
            c48342uNyOLrzqt.KWHzl.setText(uiParamEZpvd.djBIcL().getTvTitle());
            c48342uNyOLrzqt.valueOf.setText(uiParamEZpvd.EZpvd());
            c48342uNyOLrzqt.AYXKKw.setText(uiParamEZpvd.OLrzqt());
            TextView textView = c48342uNyOLrzqt.AYXKKw;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
            if (uiParamEZpvd.copydefault() != null) {
                c48342uNyOLrzqt.EZpvd.setAnimationFromUrl(uiParamEZpvd.copydefault());
            }
            if (uiParamEZpvd.KWHzl() != null) {
                c48342uNyOLrzqt.EZpvd.setAnimation(uiParamEZpvd.KWHzl().intValue());
            }
            C53769wrj c53769wrj = C53769wrj.AEQbTJ;
            String strCopydefault = c53769wrj.copydefault();
            this.AYXKKw = new TaskDescription(new WeakReference(this.KWHzl));
            Context context2 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            DataSource.Factory factoryCopydefault = c53769wrj.copydefault(context2);
            if (factoryCopydefault == null) {
                factoryCopydefault = new DefaultDataSourceFactory(constraintLayout.getContext(), Util.getUserAgent(constraintLayout.getContext(), constraintLayout.getContext().getResources().getString(C6697aUI.Activity.OLrzqt)));
            }
            ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(factoryCopydefault).createMediaSource(MediaItem.fromUri(strCopydefault));
            Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "");
            SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(constraintLayout.getContext()).build();
            c48342uNyOLrzqt.gEmmrt.setPlayer(simpleExoPlayerBuild);
            simpleExoPlayerBuild.setMediaSource(progressiveMediaSourceCreateMediaSource);
            Player.EventListener eventListener = this.AYXKKw;
            if (eventListener != null) {
                simpleExoPlayerBuild.addListener(eventListener);
            }
            simpleExoPlayerBuild.prepare();
            simpleExoPlayerBuild.setPlayWhenReady(true);
            this.AEQbTJ = simpleExoPlayerBuild;
        }
        this.KWHzl = c48342uNyOLrzqt;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.OLrzqt(C48033uCm.Fragment.OeawrHOeawrH, c52794wYpCopydefault.getContext()));
            c52794wYpCopydefault.setContentDescription("BotPreShareBottomSheetShareButton");
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55353xiO c55353xiO;
        SimpleExoPlayer simpleExoPlayer = this.AEQbTJ;
        if (simpleExoPlayer != null) {
            Player.EventListener eventListener = this.AYXKKw;
            if (eventListener != null) {
                simpleExoPlayer.removeListener(eventListener);
            }
            simpleExoPlayer.release();
        }
        this.AEQbTJ = null;
        this.AYXKKw = null;
        C48342uNy c48342uNy = this.KWHzl;
        if (c48342uNy != null && (c55353xiO = c48342uNy.EZpvd) != null) {
            c55353xiO.clearAnimation();
        }
        this.valueOf = null;
        this.OLrzqt = null;
        this.KWHzl = null;
        super.onDestroyView();
    }

    public static final class TaskDescription implements Player.EventListener {
        public final WeakReference<C48342uNy> KWHzl;

        public TaskDescription(@NotNull WeakReference<C48342uNy> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.KWHzl = weakReference;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(@NotNull ExoPlaybackException exoPlaybackException) {
            C55353xiO c55353xiO;
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            C48342uNy c48342uNy = this.KWHzl.get();
            if (c48342uNy == null || (c55353xiO = c48342uNy.EZpvd) == null) {
                return;
            }
            c55353xiO.playAnimation();
        }
    }

    public static final class UiParam implements Parcelable {
        public static final Parcelable.Creator<UiParam> CREATOR = new Creator();
        public final Integer AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final TacticsData djBIcL;

        public static final class Creator implements Parcelable.Creator<UiParam> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiParam createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UiParam(parcel.readString(), parcel.readString(), parcel.readString(), (TacticsData) parcel.readParcelable(UiParam.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiParam[] newArray(int i) {
                return new UiParam[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UiParam copy$default(UiParam uiParam, String str, String str2, String str3, TacticsData tacticsData, Integer num, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiParam.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = uiParam.copydefault;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = uiParam.EZpvd;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                tacticsData = uiParam.djBIcL;
            }
            TacticsData tacticsData2 = tacticsData;
            if ((i & 16) != 0) {
                num = uiParam.AEQbTJ;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                str4 = uiParam.OLrzqt;
            }
            return uiParam.copydefault(str, str5, str6, tacticsData2, num2, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiParam copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TacticsData tacticsData, Integer num, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            return new UiParam(str, str2, str3, tacticsData, num, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TacticsData djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiParam)) {
                return false;
            }
            UiParam uiParam = (UiParam) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) uiParam.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) uiParam.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) uiParam.EZpvd) && Intrinsics.EZpvd(this.djBIcL, uiParam.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, uiParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) uiParam.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            int iHashCode4 = this.djBIcL.hashCode();
            Integer num = this.AEQbTJ;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            String str = this.OLrzqt;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiParam(mainTitle=" + this.KWHzl + ", subTitle=" + this.copydefault + ", subValue=" + this.EZpvd + ", tacticsData=" + this.djBIcL + ", lottieRes=" + this.AEQbTJ + ", lottieCdn=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
            parcel.writeParcelable(this.djBIcL, i);
            Integer num = this.AEQbTJ;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.OLrzqt);
        }

        public UiParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TacticsData tacticsData, Integer num, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.djBIcL = tacticsData;
            this.AEQbTJ = num;
            this.OLrzqt = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 com.okinc.unify_trade.bot.data.TacticsData)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.TacticsData, java.lang.Integer, java.lang.String):void (m)] (LINE:171) call: com.okinc.tradingbot.impl.share.BotPreShareBottomSheet.UiParam.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.bot.data.TacticsData, java.lang.Integer, java.lang.String):void type: THIS */
        public /* synthetic */ UiParam(String str, String str2, String str3, TacticsData tacticsData, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, tacticsData, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4);
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ BotPreShareBottomSheet copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, BotPreShareBottomSheet botPreShareBottomSheet) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = botPreShareBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TacticsData tacticsDataDjBIcL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                UiParam uiParamEZpvd = this.copydefault.EZpvd();
                if (uiParamEZpvd == null || (tacticsDataDjBIcL = uiParamEZpvd.djBIcL()) == null) {
                    return;
                }
                Function1 function1 = this.copydefault.valueOf;
                if (function1 != null) {
                    function1.invoke(tacticsDataDjBIcL);
                }
                this.copydefault.dismiss();
            }
        }
    }
}
