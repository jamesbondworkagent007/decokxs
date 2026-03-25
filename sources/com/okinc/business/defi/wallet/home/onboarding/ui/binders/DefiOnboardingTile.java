package com.okinc.business.defi.wallet.home.onboarding.ui.binders;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntegerRes;
import androidx.annotation.StringRes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55298xhM;
import o.C56444yFp;
import o.InterfaceC18127fcY;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface DefiOnboardingTile {

    public static final class TextTile implements DefiOnboardingTile {
        public final Integer AEQbTJ;
        public final int EZpvd;
        public final String KWHzl;
        public final TextStyle OLrzqt;
        public final TaskDescription copydefault;
        public final InterfaceC18127fcY.TaskDescription djBIcL;
        public final Application gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TextTile copy$default(TextTile textTile, InterfaceC18127fcY.TaskDescription taskDescription, TextStyle textStyle, String str, int i, TaskDescription taskDescription2, Application application, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                taskDescription = textTile.djBIcL;
            }
            if ((i2 & 2) != 0) {
                textStyle = textTile.OLrzqt;
            }
            TextStyle textStyle2 = textStyle;
            if ((i2 & 4) != 0) {
                str = textTile.KWHzl;
            }
            String str2 = str;
            if ((i2 & 8) != 0) {
                i = textTile.EZpvd;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                taskDescription2 = textTile.copydefault;
            }
            TaskDescription taskDescription3 = taskDescription2;
            if ((i2 & 32) != 0) {
                application = textTile.gEmmrt;
            }
            Application application2 = application;
            if ((i2 & 64) != 0) {
                num = textTile.AEQbTJ;
            }
            return textTile.copydefault(taskDescription, textStyle2, str2, i3, taskDescription3, application2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextStyle AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextTile copydefault(InterfaceC18127fcY.TaskDescription taskDescription, @NotNull TextStyle textStyle, String str, int i, @NotNull TaskDescription taskDescription2, Application application, @StringRes Integer num) {
            Intrinsics.checkNotNullParameter(textStyle, "");
            Intrinsics.checkNotNullParameter(taskDescription2, "");
            return new TextTile(taskDescription, textStyle, str, i, taskDescription2, application, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextTile)) {
                return false;
            }
            TextTile textTile = (TextTile) obj;
            return Intrinsics.EZpvd(this.djBIcL, textTile.djBIcL) && this.OLrzqt == textTile.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) textTile.KWHzl) && this.EZpvd == textTile.EZpvd && Intrinsics.EZpvd(this.copydefault, textTile.copydefault) && Intrinsics.EZpvd(this.gEmmrt, textTile.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, textTile.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC18127fcY.TaskDescription gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            InterfaceC18127fcY.TaskDescription taskDescription = this.djBIcL;
            int iHashCode = taskDescription == null ? 0 : taskDescription.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            String str = this.KWHzl;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            int iHashCode4 = Integer.hashCode(this.EZpvd);
            int iHashCode5 = this.copydefault.hashCode();
            Application application = this.gEmmrt;
            int iHashCode6 = application == null ? 0 : application.hashCode();
            Integer num = this.AEQbTJ;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TextTile(textButtonType=" + this.djBIcL + ", style=" + this.OLrzqt + ", content=" + this.KWHzl + ", gravity=" + this.EZpvd + ", padding=" + this.copydefault + ", textDrawable=" + this.gEmmrt + ", strRes=" + this.AEQbTJ + ")";
        }

        public TextTile(InterfaceC18127fcY.TaskDescription taskDescription, @NotNull TextStyle textStyle, String str, int i, @NotNull TaskDescription taskDescription2, Application application, @StringRes Integer num) {
            Intrinsics.checkNotNullParameter(textStyle, "");
            Intrinsics.checkNotNullParameter(taskDescription2, "");
            this.djBIcL = taskDescription;
            this.OLrzqt = textStyle;
            this.KWHzl = str;
            this.EZpvd = i;
            this.copydefault = taskDescription2;
            this.gEmmrt = application;
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:o.fcY$TaskDescription:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.fcY$TaskDescription) : (r11v0 o.fcY$TaskDescription))
  (r12v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TextStyle)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (17 int) : (r14v0 int))
  (wrap:com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TaskDescription:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: CONSTRUCTOR 
  (wrap:int:0x0021: INVOKE 
  (24 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.xhM.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED])
  (0 int)
  (wrap:int:0x0025: INVOKE 
  (24 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.xhM.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED])
  (0 int)
 A[MD:(int, int, int, int):void (m), WRAPPED] (LINE:24) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.TextTile.TaskDescription.<init>(int, int, int, int):void type: CONSTRUCTOR) : (r15v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TaskDescription))
  (wrap:com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$Application:?: TERNARY null = ((wrap:int:0x0030: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$Application) : (r16v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$Application))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0038: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
 A[MD:(o.fcY$TaskDescription, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TextStyle, java.lang.String, int, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TaskDescription, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$Application, java.lang.Integer):void (m)] (LINE:19) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.TextTile.<init>(o.fcY$TaskDescription, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TextStyle, java.lang.String, int, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$TaskDescription, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TextTile$Application, java.lang.Integer):void type: THIS */
        public /* synthetic */ TextTile(InterfaceC18127fcY.TaskDescription taskDescription, TextStyle textStyle, String str, int i, TaskDescription taskDescription2, Application application, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : taskDescription, textStyle, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 17 : i, (i2 & 16) != 0 ? new TaskDescription(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), 0, C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), 0) : taskDescription2, (i2 & 32) != 0 ? null : application, (i2 & 64) != 0 ? null : num);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TextStyle {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ TextStyle[] $VALUES;
            public static final TextStyle Header = new TextStyle("Header", 0);
            public static final TextStyle Desc = new TextStyle("Desc", 1);
            public static final TextStyle TextButton = new TextStyle("TextButton", 2);
            public static final TextStyle Content = new TextStyle("Content", 3);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ TextStyle[] $values() {
                return new TextStyle[]{Header, Desc, TextButton, Content};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<TextStyle> getEntries() {
                return $ENTRIES;
            }

            private TextStyle(String str, int i) {
            }

            static {
                TextStyle[] textStyleArr$values = $values();
                $VALUES = textStyleArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(textStyleArr$values);
            }

            public static TextStyle valueOf(String str) {
                return (TextStyle) Enum.valueOf(TextStyle.class, str);
            }

            public static TextStyle[] values() {
                return (TextStyle[]) $VALUES.clone();
            }
        }

        public static final class Application {
            public final Drawable AEQbTJ;
            public final Drawable KWHzl;
            public final Drawable OLrzqt;
            public final Drawable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application() {
                this(null, null, null, null, 15, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
                if ((i & 1) != 0) {
                    drawable = application.copydefault;
                }
                if ((i & 2) != 0) {
                    drawable2 = application.OLrzqt;
                }
                if ((i & 4) != 0) {
                    drawable3 = application.AEQbTJ;
                }
                if ((i & 8) != 0) {
                    drawable4 = application.KWHzl;
                }
                return application.KWHzl(drawable, drawable2, drawable3, drawable4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Drawable EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
                return new Application(drawable, drawable2, drawable3, drawable4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Drawable drawable = this.copydefault;
                int iHashCode = drawable == null ? 0 : drawable.hashCode();
                Drawable drawable2 = this.OLrzqt;
                int iHashCode2 = drawable2 == null ? 0 : drawable2.hashCode();
                Drawable drawable3 = this.AEQbTJ;
                int iHashCode3 = drawable3 == null ? 0 : drawable3.hashCode();
                Drawable drawable4 = this.KWHzl;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (drawable4 != null ? drawable4.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TextDrawable(left=" + this.copydefault + ", top=" + this.OLrzqt + ", right=" + this.AEQbTJ + ", bottom=" + this.KWHzl + ")";
            }

            public Application(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
                this.copydefault = drawable;
                this.OLrzqt = drawable2;
                this.AEQbTJ = drawable3;
                this.KWHzl = drawable4;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r2v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r3v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r4v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r5v0 android.graphics.drawable.Drawable))
 A[MD:(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void (m)] (LINE:32) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.TextTile.Application.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void type: THIS */
            public /* synthetic */ Application(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : drawable, (i & 2) != 0 ? null : drawable2, (i & 4) != 0 ? null : drawable3, (i & 8) != 0 ? null : drawable4);
            }
        }

        public static final class TaskDescription {
            public final int AEQbTJ;
            public final int KWHzl;
            public final int OLrzqt;
            public final int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i = taskDescription.OLrzqt;
                }
                if ((i5 & 2) != 0) {
                    i2 = taskDescription.KWHzl;
                }
                if ((i5 & 4) != 0) {
                    i3 = taskDescription.AEQbTJ;
                }
                if ((i5 & 8) != 0) {
                    i4 = taskDescription.copydefault;
                }
                return taskDescription.AEQbTJ(i, i2, i3, i4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(int i, int i2, int i3, int i4) {
                return new TaskDescription(i, i2, i3, i4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return this.OLrzqt == taskDescription.OLrzqt && this.KWHzl == taskDescription.KWHzl && this.AEQbTJ == taskDescription.AEQbTJ && this.copydefault == taskDescription.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Integer.hashCode(this.OLrzqt) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Padding(left=" + this.OLrzqt + ", top=" + this.KWHzl + ", right=" + this.AEQbTJ + ", bottom=" + this.copydefault + ")";
            }

            public TaskDescription(int i, int i2, int i3, int i4) {
                this.OLrzqt = i;
                this.KWHzl = i2;
                this.AEQbTJ = i3;
                this.copydefault = i4;
            }
        }
    }

    public static final class ButtonTile implements DefiOnboardingTile {
        public final String AEQbTJ;
        public final ButtonWidth AYXKKw;
        public final int EZpvd;
        public final InterfaceC18127fcY KWHzl;
        public final int OLrzqt;
        public final ButtonHeight copydefault;
        public final ButtonStyle djBIcL;
        public final Integer valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ButtonHeight AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC18127fcY EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ButtonTile KWHzl(@NotNull InterfaceC18127fcY interfaceC18127fcY, @NotNull ButtonStyle buttonStyle, @NotNull ButtonWidth buttonWidth, @NotNull ButtonHeight buttonHeight, String str, int i, int i2, @StringRes Integer num) {
            Intrinsics.checkNotNullParameter(interfaceC18127fcY, "");
            Intrinsics.checkNotNullParameter(buttonStyle, "");
            Intrinsics.checkNotNullParameter(buttonWidth, "");
            Intrinsics.checkNotNullParameter(buttonHeight, "");
            return new ButtonTile(interfaceC18127fcY, buttonStyle, buttonWidth, buttonHeight, str, i, i2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ButtonWidth djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonTile)) {
                return false;
            }
            ButtonTile buttonTile = (ButtonTile) obj;
            return Intrinsics.EZpvd(this.KWHzl, buttonTile.KWHzl) && this.djBIcL == buttonTile.djBIcL && this.AYXKKw == buttonTile.AYXKKw && this.copydefault == buttonTile.copydefault && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buttonTile.AEQbTJ) && this.OLrzqt == buttonTile.OLrzqt && this.EZpvd == buttonTile.EZpvd && Intrinsics.EZpvd(this.valueOf, buttonTile.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ButtonStyle gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            int iHashCode3 = this.AYXKKw.hashCode();
            int iHashCode4 = this.copydefault.hashCode();
            String str = this.AEQbTJ;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            int iHashCode6 = Integer.hashCode(this.OLrzqt);
            int iHashCode7 = Integer.hashCode(this.EZpvd);
            Integer num = this.valueOf;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ButtonTile(buttonType=" + this.KWHzl + ", style=" + this.djBIcL + ", width=" + this.AYXKKw + ", height=" + this.copydefault + ", label=" + this.AEQbTJ + ", alignWithRoot=" + this.OLrzqt + ", gravity=" + this.EZpvd + ", strRes=" + this.valueOf + ")";
        }

        public ButtonTile(@NotNull InterfaceC18127fcY interfaceC18127fcY, @NotNull ButtonStyle buttonStyle, @NotNull ButtonWidth buttonWidth, @NotNull ButtonHeight buttonHeight, String str, int i, int i2, @StringRes Integer num) {
            Intrinsics.checkNotNullParameter(interfaceC18127fcY, "");
            Intrinsics.checkNotNullParameter(buttonStyle, "");
            Intrinsics.checkNotNullParameter(buttonWidth, "");
            Intrinsics.checkNotNullParameter(buttonHeight, "");
            this.KWHzl = interfaceC18127fcY;
            this.djBIcL = buttonStyle;
            this.AYXKKw = buttonWidth;
            this.copydefault = buttonHeight;
            this.AEQbTJ = str;
            this.OLrzqt = i;
            this.EZpvd = i2;
            this.valueOf = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r12v0 o.fcY)
  (r13v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonStyle)
  (r14v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonWidth)
  (wrap:com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonHeight:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:46) com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.ButtonTile.ButtonHeight.DEFAULT com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonHeight) : (r15v0 com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonHeight))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (17 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (17 int) : (r18v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
 A[MD:(o.fcY, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonStyle, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonWidth, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonHeight, java.lang.String, int, int, java.lang.Integer):void (m)] (LINE:42) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.ButtonTile.<init>(o.fcY, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonStyle, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonWidth, com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$ButtonTile$ButtonHeight, java.lang.String, int, int, java.lang.Integer):void type: THIS */
        public /* synthetic */ ButtonTile(InterfaceC18127fcY interfaceC18127fcY, ButtonStyle buttonStyle, ButtonWidth buttonWidth, ButtonHeight buttonHeight, String str, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC18127fcY, buttonStyle, buttonWidth, (i3 & 8) != 0 ? ButtonHeight.DEFAULT : buttonHeight, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? 17 : i, (i3 & 64) != 0 ? 17 : i2, (i3 & 128) != 0 ? null : num);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ButtonStyle {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ButtonStyle[] $VALUES;
            public static final ButtonStyle Filled = new ButtonStyle("Filled", 0);
            public static final ButtonStyle Outlined = new ButtonStyle("Outlined", 1);
            public static final ButtonStyle Text = new ButtonStyle("Text", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ButtonStyle[] $values() {
                return new ButtonStyle[]{Filled, Outlined, Text};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ButtonStyle> getEntries() {
                return $ENTRIES;
            }

            private ButtonStyle(String str, int i) {
            }

            static {
                ButtonStyle[] buttonStyleArr$values = $values();
                $VALUES = buttonStyleArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(buttonStyleArr$values);
            }

            public static ButtonStyle valueOf(String str) {
                return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
            }

            public static ButtonStyle[] values() {
                return (ButtonStyle[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ButtonWidth {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ButtonWidth[] $VALUES;
            public static final ButtonWidth MatchParent = new ButtonWidth("MatchParent", 0);
            public static final ButtonWidth WrapContent = new ButtonWidth("WrapContent", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ButtonWidth[] $values() {
                return new ButtonWidth[]{MatchParent, WrapContent};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ButtonWidth> getEntries() {
                return $ENTRIES;
            }

            private ButtonWidth(String str, int i) {
            }

            static {
                ButtonWidth[] buttonWidthArr$values = $values();
                $VALUES = buttonWidthArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(buttonWidthArr$values);
            }

            public static ButtonWidth valueOf(String str) {
                return (ButtonWidth) Enum.valueOf(ButtonWidth.class, str);
            }

            public static ButtonWidth[] values() {
                return (ButtonWidth[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ButtonHeight {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ButtonHeight[] $VALUES;
            public static final ButtonHeight DEFAULT = new ButtonHeight("DEFAULT", 0);
            public static final ButtonHeight LARGE = new ButtonHeight("LARGE", 1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ButtonHeight[] $values() {
                return new ButtonHeight[]{DEFAULT, LARGE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ButtonHeight> getEntries() {
                return $ENTRIES;
            }

            private ButtonHeight(String str, int i) {
            }

            static {
                ButtonHeight[] buttonHeightArr$values = $values();
                $VALUES = buttonHeightArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(buttonHeightArr$values);
            }

            public static ButtonHeight valueOf(String str) {
                return (ButtonHeight) Enum.valueOf(ButtonHeight.class, str);
            }

            public static ButtonHeight[] values() {
                return (ButtonHeight[]) $VALUES.clone();
            }
        }
    }

    public static final class StateListAnimator implements DefiOnboardingTile {
        public final int AEQbTJ;
        public final Rect EZpvd;
        public final ImageView.ScaleType KWHzl;
        public final String OLrzqt;
        public final Integer copydefault;
        public final int djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, 0, 0, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, ImageView.ScaleType scaleType, Integer num, int i, int i2, Rect rect, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                scaleType = stateListAnimator.KWHzl;
            }
            ImageView.ScaleType scaleType2 = scaleType;
            if ((i3 & 4) != 0) {
                num = stateListAnimator.copydefault;
            }
            Integer num2 = num;
            if ((i3 & 8) != 0) {
                i = stateListAnimator.djBIcL;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = stateListAnimator.AEQbTJ;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                rect = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(str, scaleType2, num2, i4, i5, rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rect AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageView.ScaleType OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(String str, ImageView.ScaleType scaleType, @DrawableRes Integer num, @IntegerRes int i, @IntegerRes int i2, Rect rect) {
            return new StateListAnimator(str, scaleType, num, i, i2, rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.djBIcL == stateListAnimator.djBIcL && this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            ImageView.ScaleType scaleType = this.KWHzl;
            int iHashCode2 = scaleType == null ? 0 : scaleType.hashCode();
            Integer num = this.copydefault;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            int iHashCode4 = Integer.hashCode(this.djBIcL);
            int iHashCode5 = Integer.hashCode(this.AEQbTJ);
            Rect rect = this.EZpvd;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (rect != null ? rect.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ImageTile(url=" + this.OLrzqt + ", scaleType=" + this.KWHzl + ", imgRes=" + this.copydefault + ", width=" + this.djBIcL + ", height=" + this.AEQbTJ + ", margins=" + this.EZpvd + ")";
        }

        public StateListAnimator(String str, ImageView.ScaleType scaleType, @DrawableRes Integer num, @IntegerRes int i, @IntegerRes int i2, Rect rect) {
            this.OLrzqt = str;
            this.KWHzl = scaleType;
            this.copydefault = num;
            this.djBIcL = i;
            this.AEQbTJ = i2;
            this.EZpvd = rect;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:android.widget.ImageView$ScaleType:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.widget.ImageView$ScaleType) : (r7v0 android.widget.ImageView$ScaleType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r9v0 int))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r10v0 int))
  (wrap:android.graphics.Rect:?: TERNARY null = ((wrap:int:0x0022: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Rect) : (r11v0 android.graphics.Rect))
 A[MD:(java.lang.String, android.widget.ImageView$ScaleType, java.lang.Integer, int, int, android.graphics.Rect):void (m)] (LINE:70) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.StateListAnimator.<init>(java.lang.String, android.widget.ImageView$ScaleType, java.lang.Integer, int, int, android.graphics.Rect):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, ImageView.ScaleType scaleType, Integer num, int i, int i2, Rect rect, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : scaleType, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? -2 : i2, (i3 & 32) != 0 ? null : rect);
        }
    }

    public static final class TaskDescription implements DefiOnboardingTile {
        public final List<ActionBar> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ActionBar> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NftCarouselTile(collections=" + this.EZpvd + ")";
        }

        public static final class ActionBar {
            public final int AEQbTJ;
            public final String KWHzl;
            public final String OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = actionBar.AEQbTJ;
                }
                if ((i2 & 2) != 0) {
                    str = actionBar.OLrzqt;
                }
                if ((i2 & 4) != 0) {
                    str2 = actionBar.copydefault;
                }
                if ((i2 & 8) != 0) {
                    str3 = actionBar.KWHzl;
                }
                return actionBar.AEQbTJ(i, str, str2, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(int i, @NotNull String str, @NotNull String str2, String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ActionBar(i, str, str2, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Integer.hashCode(this.AEQbTJ);
                int iHashCode2 = this.OLrzqt.hashCode();
                int iHashCode3 = this.copydefault.hashCode();
                String str = this.KWHzl;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NftCollection(projectId=" + this.AEQbTJ + ", projectName=" + this.OLrzqt + ", chainId=" + this.copydefault + ", image=" + this.KWHzl + ")";
            }

            public ActionBar(int i, @NotNull String str, @NotNull String str2, String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = i;
                this.OLrzqt = str;
                this.copydefault = str2;
                this.KWHzl = str3;
            }
        }

        public TaskDescription(@NotNull List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    public static final class TokenGroupTile implements DefiOnboardingTile {
        public final List<TokenInfo> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile$TokenGroupTile */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TokenGroupTile copy$default(TokenGroupTile tokenGroupTile, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tokenGroupTile.AEQbTJ;
            }
            return tokenGroupTile.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenGroupTile AEQbTJ(@NotNull List<TokenInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TokenGroupTile(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TokenInfo> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TokenGroupTile) && Intrinsics.EZpvd(this.AEQbTJ, ((TokenGroupTile) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenGroupTile(tokens=" + this.AEQbTJ + ")";
        }

        public TokenGroupTile(@NotNull List<TokenInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        public static final class TokenInfo implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<TokenInfo> CREATOR = new Creator();
            private final String logo;
            private final String name;

            public static final class Creator implements Parcelable.Creator<TokenInfo> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TokenInfo createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new TokenInfo(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TokenInfo[] newArray(int i) {
                    return new TokenInfo[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tokenInfo.name;
                }
                if ((i & 2) != 0) {
                    str2 = tokenInfo.logo;
                }
                return tokenInfo.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.logo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TokenInfo copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new TokenInfo(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TokenInfo)) {
                    return false;
                }
                TokenInfo tokenInfo = (TokenInfo) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) tokenInfo.name) && Intrinsics.EZpvd((Object) this.logo, (Object) tokenInfo.logo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getLogo() {
                return this.logo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.name.hashCode() * 31) + this.logo.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TokenInfo(name=" + this.name + ", logo=" + this.logo + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.name);
                parcel.writeString(this.logo);
            }

            public TokenInfo(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.name = str;
                this.logo = str2;
            }
        }
    }

    public static final class Activity implements DefiOnboardingTile {
        public final float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0.0f, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = activity.OLrzqt;
            }
            return activity.copydefault(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(float f) {
            return new Activity(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Float.compare(this.OLrzqt, ((Activity) obj).OLrzqt) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Float.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpacerTile(heightDp=" + this.OLrzqt + ")";
        }

        public Activity(float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r1v0 float))
 A[MD:(float):void (m)] (LINE:96) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.Activity.<init>(float):void type: THIS */
        public /* synthetic */ Activity(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1.0f : f);
        }
    }

    public static final class Application implements DefiOnboardingTile {
        public final float KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0.0f, 0, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, float f, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = application.KWHzl;
            }
            if ((i2 & 2) != 0) {
                i = application.OLrzqt;
            }
            return application.OLrzqt(f, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(float f, @ColorRes int i) {
            return new Application(f, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Float.compare(this.KWHzl, application.KWHzl) == 0 && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Float.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DividerTile(heightDp=" + this.KWHzl + ", color=" + this.OLrzqt + ")";
        }

        public Application(float f, @ColorRes int i) {
            this.KWHzl = f;
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r1v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r2v0 int))
 A[MD:(float, int):void (m)] (LINE:98) call: com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile.Application.<init>(float, int):void type: THIS */
        public /* synthetic */ Application(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? C52761wXj.Activity.zuBGHE : i);
        }
    }
}
