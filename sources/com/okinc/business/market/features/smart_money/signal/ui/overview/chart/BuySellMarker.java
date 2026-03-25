package com.okinc.business.market.features.smart_money.signal.ui.overview.chart;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23271hvA;
import o.C23274hvD;
import o.C25382ivf;
import o.C33069mpW;
import o.C33492mxV;
import o.C52761wXj;
import o.C55298xhM;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellMarker {
    public static final ActionBar Companion = new ActionBar(null);
    public final long AEQbTJ;
    public final SignalUiModel EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final Type djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellMarker KWHzl(long j, @NotNull Type type, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SignalUiModel signalUiModel) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        return new BuySellMarker(j, type, str, str2, str3, signalUiModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalUiModel OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellMarker)) {
            return false;
        }
        BuySellMarker buySellMarker = (BuySellMarker) obj;
        return this.AEQbTJ == buySellMarker.AEQbTJ && this.djBIcL == buySellMarker.djBIcL && Intrinsics.EZpvd((Object) this.copydefault, (Object) buySellMarker.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) buySellMarker.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buySellMarker.KWHzl) && Intrinsics.EZpvd(this.EZpvd, buySellMarker.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.AEQbTJ) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellMarker(timestampInMillis=" + this.AEQbTJ + ", type=" + this.djBIcL + ", tooltip=" + this.copydefault + ", timestamp=" + this.OLrzqt + ", signalUiModelId=" + this.KWHzl + ", signalUiModel=" + this.EZpvd + ")";
    }

    public BuySellMarker(long j, @NotNull Type type, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SignalUiModel signalUiModel) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(signalUiModel, "");
        this.AEQbTJ = j;
        this.djBIcL = type;
        this.copydefault = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.EZpvd = signalUiModel;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BUY = new Type("BUY", 0, "B");
        public static final Type SELL = new Type("SELL", 1, ExifInterface.LATITUDE_SOUTH);
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ Activity createDrawable$default(BuySellMarker buySellMarker, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return buySellMarker.OLrzqt(context, z);
    }

    public final Activity OLrzqt(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        return new Activity(context, this.djBIcL == Type.BUY, z);
    }

    public static final class ActionBar {

        /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker$ActionBar$ActionBar, reason: collision with other inner class name */
        public final /* synthetic */ class C0370ActionBar {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[InfluencerType.values().length];
                try {
                    iArr[InfluencerType.KOLs.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InfluencerType.SMART_MONEY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InfluencerType.WHALES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final String OLrzqt(SignalUiModel signalUiModel, Context context) {
            int i;
            int i2 = C0370ActionBar.EZpvd[signalUiModel.valueOf().ordinal()];
            if (i2 == 1) {
                i = C23274hvD.Fragment.DXXBbs;
            } else if (i2 == 2) {
                i = C23274hvD.Fragment.OqFWZa;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23274hvD.Fragment.ODWQjV;
            }
            return C33069mpW.KWHzl(context, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", Integer.valueOf(signalUiModel.values()))));
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.hvA.getLocalCurrencyWithPrecision$default(o.hvA, java.lang.String, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
        public static final String EZpvd(SignalUiModel signalUiModel, Context context) {
            return C33069mpW.KWHzl(context, C23274hvD.Fragment.DAIeex, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C23271hvA.getLocalCurrencyWithPrecision$default(C23271hvA.copydefault, signalUiModel.fARcdN(), null, 1, null))));
        }

        public static final String AEQbTJ(SignalUiModel signalUiModel, SignalUiModel signalUiModel2, Context context) {
            return OLrzqt(signalUiModel2, context) + " " + EZpvd(signalUiModel2, context);
        }

        public final BuySellMarker copydefault(@NotNull Context context, @NotNull SignalUiModel signalUiModel) {
            Type type;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(signalUiModel, "");
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(signalUiModel.AYXKKw());
            if (fieldNames == null) {
                return null;
            }
            long jLongValue = fieldNames.longValue();
            if (signalUiModel.ejfBZ() == TxType.BUY) {
                type = Type.BUY;
            } else {
                if (signalUiModel.ejfBZ() != TxType.SELL) {
                    return null;
                }
                type = Type.SELL;
            }
            return new BuySellMarker(jLongValue, type, AEQbTJ(signalUiModel, signalUiModel, context), pTA.format$default(new Date(Long.parseLong(signalUiModel.AYXKKw())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), signalUiModel.djBIcL(), signalUiModel);
        }
    }

    public static final class Activity extends Drawable {
        public final boolean AEQbTJ;
        public final Paint AYXKKw;
        public final Paint AhwBna;
        public ValueAnimator AkhnZx;
        public float DbNXlk;
        public final int EZpvd;
        public final float KWHzl;
        public final int OLrzqt;
        public final float copydefault;
        public final Paint djBIcL;
        public final Paint fJNWhG;
        public float fetchVPNInfo;
        public Function0<Unit> gEmmrt;
        public final String isConnected;
        public Function0<Unit> valueOf;
        public final int values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Function0<Unit> function0) {
            this.gEmmrt = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Function0<Unit> function0) {
            this.valueOf = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.OLrzqt;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public Activity(@NotNull Context context, boolean z, boolean z2) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(context, "");
            this.AEQbTJ = z2;
            String string = context.getString(z ? C23274hvD.Fragment.getOnBackPressedDispatcher : C23274hvD.Fragment.onActivityResult);
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.isConnected = string;
            Paint paint = new Paint(1);
            paint.setColor(ContextCompat.getColor(context, C23274hvD.StateListAnimator.ORxRYg));
            paint.setTextSize(C55298xhM.EZpvd(10.0f, context));
            paint.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD, 1));
            paint.setTextAlign(Paint.Align.CENTER);
            this.fJNWhG = paint;
            Paint paint2 = new Paint(1);
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            this.AYXKKw = paint2;
            Paint paint3 = new Paint(1);
            paint3.setStyle(style);
            this.AhwBna = paint3;
            Paint paint4 = new Paint(1);
            paint4.setStyle(style);
            this.djBIcL = paint4;
            this.copydefault = C55298xhM.EZpvd(9.0f, context);
            this.KWHzl = C55298xhM.EZpvd(17.0f, context);
            this.OLrzqt = C55298xhM.KWHzl(34.0f, context);
            if (z) {
                i = C23274hvD.StateListAnimator.AwvSrB;
            } else {
                i = C33492mxV.OLrzqt() ? C52761wXj.Activity.YqksP : C52761wXj.Activity.DQzvGN;
            }
            int iKWHzl = C25382ivf.KWHzl(context, i);
            this.EZpvd = iKWHzl;
            if (z) {
                i2 = C23274hvD.StateListAnimator.DTwDnp;
            } else {
                i2 = C33492mxV.OLrzqt() ? C52761wXj.Activity.YqksP : C52761wXj.Activity.DQzvGN;
            }
            int iKWHzl2 = C25382ivf.KWHzl(context, i2);
            this.values = iKWHzl2;
            paint2.setColor(iKWHzl);
            paint4.setColor(iKWHzl2);
            if (z2) {
                KWHzl();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            float fWidth = getBounds().width() / 2.0f;
            float fHeight = getBounds().height() / 2.0f;
            if (this.AEQbTJ) {
                this.AhwBna.setShader(new RadialGradient(fWidth, fHeight, this.KWHzl, ColorUtils.setAlphaComponent(this.values, 127), 0, Shader.TileMode.CLAMP));
                canvas.drawCircle(fWidth, fHeight, this.KWHzl, this.AhwBna);
            }
            this.djBIcL.setAlpha((int) (this.DbNXlk * 255));
            canvas.drawCircle(fWidth, fHeight, this.fetchVPNInfo, this.djBIcL);
            canvas.drawCircle(fWidth, fHeight, this.copydefault, this.AYXKKw);
            canvas.drawText(this.isConnected, fWidth, fHeight - ((this.fJNWhG.descent() + this.fJNWhG.ascent()) / 2.0f), this.fJNWhG);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.AYXKKw.setAlpha(i);
            this.fJNWhG.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.AYXKKw.setColorFilter(colorFilter);
            this.fJNWhG.setColorFilter(colorFilter);
        }

        public final void KWHzl() {
            ValueAnimator valueAnimator = this.AkhnZx;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.KWHzl * 1.4f);
            valueAnimatorOfFloat.setDuration(800L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addListener(new TaskDescription());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.kxq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    BuySellMarker.Activity.OLrzqt(this.KWHzl, valueAnimator2);
                }
            });
            valueAnimatorOfFloat.setStartDelay(200L);
            valueAnimatorOfFloat.start();
            this.AkhnZx = valueAnimatorOfFloat;
        }

        public static final class TaskDescription extends AnimatorListenerAdapter {
            public TaskDescription() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                Function0<Unit> function0EZpvd = Activity.this.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                Function0<Unit> function0Copydefault = Activity.this.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                Function0<Unit> function0Copydefault = Activity.this.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }

        public static final void OLrzqt(Activity activity, ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.copydefault(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            activity.fetchVPNInfo = fFloatValue;
            activity.DbNXlk = 1.0f - (fFloatValue / (activity.KWHzl * 1.4f));
            activity.invalidateSelf();
        }

        public final void AEQbTJ() {
            ValueAnimator valueAnimator = this.AkhnZx;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.AkhnZx = null;
            this.gEmmrt = null;
            this.valueOf = null;
            this.fetchVPNInfo = 0.0f;
            this.DbNXlk = 0.0f;
        }
    }
}
