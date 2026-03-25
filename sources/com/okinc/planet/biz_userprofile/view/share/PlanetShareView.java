package com.okinc.planet.biz_userprofile.view.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C33054mpH;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C43251rlk;
import o.C52761wXj;
import o.C55374xij;
import o.C56441yFm;
import o.C56442yFn;
import o.C56444yFp;
import o.C56447yFs;
import o.InterfaceC56445yFq;
import o.InterfaceC8101awQ;
import o.tLR;
import o.tLS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class PlanetShareView<T extends ViewBinding> {

    /* JADX INFO: loaded from: classes19.dex */
    public interface Application {
    }

    public abstract AbstractActivityC33041mov OLrzqt();

    public abstract Object copydefault(@NotNull PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, @NotNull Continuation<? super TaskDescription> continuation);

    public abstract tLR copydefault();

    public abstract PlanetShareView<T> djBIcL();

    public abstract OKIMShareParams valueOf();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar implements Function1<Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Boolean> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            KWHzl(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(boolean z) {
            this.OLrzqt.resume(Boolean.valueOf(z), new Function1<Throwable, Unit>() { // from class: com.okinc.planet.biz_userprofile.view.share.PlanetShareView.ActionBar.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final void OLrzqt(Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Throwable th) {
                    OLrzqt(th);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class FragmentManager implements Function1<Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Boolean> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            AEQbTJ(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(boolean z) {
            this.KWHzl.resume(Boolean.valueOf(z), new Function1<Throwable, Unit>() { // from class: com.okinc.planet.biz_userprofile.view.share.PlanetShareView.FragmentManager.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final void OLrzqt(Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Throwable th) {
                    OLrzqt(th);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static /* synthetic */ Object initShareView$default(PlanetShareView planetShareView, PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initShareView");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return planetShareView.copydefault(planetProfileShareBean, z, z2, continuation);
    }

    public final Object copydefault(@NotNull Application application, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Continuation<? super Drawable> continuation) {
        if (application instanceof Activity) {
            return BuildersKt.withContext(Dispatchers.getIO(), new PlanetShareView$loadImage$2(application, abstractActivityC33041mov, null), continuation);
        }
        if (!(application instanceof StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new PlanetShareView$loadImage$3(abstractActivityC33041mov, application, null), continuation);
    }

    public final int OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(StringsKt__StringsKt.EZpvd(str, (CharSequence) "%"));
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        Context contextKWHzl = C55374xij.KWHzl(OLrzqt(), 32, c33512mxp.isConnected() == 0 ? C52761wXj.LoaderManager.DXXBbs : C52761wXj.LoaderManager.ODWQjV);
        return C33129mqd.AEQbTJ(bigDecimalEZpvd, 0) ? C33512mxp.tradeRise$default(c33512mxp, contextKWHzl, 0.0f, 2, null) : C33129mqd.gEmmrt(bigDecimalEZpvd, 0) ? C33512mxp.tradeFall$default(c33512mxp, contextKWHzl, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.zblBkD);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements Application {
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final Integer OLrzqt;
        public final Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, String str3, Integer num, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = activity.AEQbTJ;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                num = activity.OLrzqt;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                f = activity.copydefault;
            }
            return activity.AEQbTJ(str, str4, str5, num2, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @ColorRes Integer num, Float f) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Activity(str, str2, str3, num, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            Integer num = this.OLrzqt;
            int iHashCode4 = num == null ? 0 : num.hashCode();
            Float f = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f != null ? f.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AvatarParams(portrait=" + this.KWHzl + ", targetId=" + this.EZpvd + ", nickName=" + this.AEQbTJ + ", borderColor=" + this.OLrzqt + ", borderWidthPx=" + this.copydefault + ")";
        }

        public Activity(@NotNull String str, @NotNull String str2, @NotNull String str3, @ColorRes Integer num, Float f) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.AEQbTJ = str3;
            this.OLrzqt = num;
            this.copydefault = f;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator implements Application {
        public final Integer EZpvd;
        public final Integer KWHzl;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                num = stateListAnimator.EZpvd;
            }
            if ((i & 4) != 0) {
                num2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(str, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull String str, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, num, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer copydefault() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            Integer num = this.EZpvd;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleImageParams(url=" + this.OLrzqt + ", width=" + this.EZpvd + ", height=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull String str, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.EZpvd = num;
            this.KWHzl = num2;
        }
    }

    public static final class TaskDescription {
        public final View EZpvd;
        public final String KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View), (r2v0 int), (r3v0 java.lang.String) A[MD:(android.view.View, int, java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.view.share.PlanetShareView.TaskDescription.<init>(android.view.View, int, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(View view, int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-BJ3UHR4$default, reason: not valid java name */
        public static /* synthetic */ TaskDescription m7059copyBJ3UHR4$default(TaskDescription taskDescription, View view, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                view = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = taskDescription.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                str = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(view, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull View view, int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(view, i, str, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.OLrzqt == taskDescription.OLrzqt && tLS.copydefault(this.KWHzl, taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + tLS.OLrzqt(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewPayload(viewWithFooter=" + this.EZpvd + ", footerId=" + this.OLrzqt + ", url=" + tLS.KWHzl(this.KWHzl) + ")";
        }

        public TaskDescription(View view, int i, String str) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = view;
            this.OLrzqt = i;
            this.KWHzl = str;
        }
    }

    public static final class OKIMShareParams {
        public final boolean AEQbTJ;
        public final EcoBizName EZpvd;
        public final Integer KWHzl;
        public final IMMessageShareModel.CTAType OLrzqt;
        public final Integer copydefault;
        public final Integer djBIcL;
        public final Integer gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OKIMShareParams copy$default(OKIMShareParams oKIMShareParams, Integer num, Integer num2, boolean z, IMMessageShareModel.CTAType cTAType, Integer num3, Integer num4, EcoBizName ecoBizName, int i, Object obj) {
            if ((i & 1) != 0) {
                num = oKIMShareParams.gEmmrt;
            }
            if ((i & 2) != 0) {
                num2 = oKIMShareParams.KWHzl;
            }
            Integer num5 = num2;
            if ((i & 4) != 0) {
                z = oKIMShareParams.AEQbTJ;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                cTAType = oKIMShareParams.OLrzqt;
            }
            IMMessageShareModel.CTAType cTAType2 = cTAType;
            if ((i & 16) != 0) {
                num3 = oKIMShareParams.copydefault;
            }
            Integer num6 = num3;
            if ((i & 32) != 0) {
                num4 = oKIMShareParams.djBIcL;
            }
            Integer num7 = num4;
            if ((i & 64) != 0) {
                ecoBizName = oKIMShareParams.EZpvd;
            }
            return oKIMShareParams.KWHzl(num, num5, z2, cTAType2, num6, num7, ecoBizName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EcoBizName EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKIMShareParams KWHzl(@StringRes Integer num, @StringRes Integer num2, boolean z, @NotNull IMMessageShareModel.CTAType cTAType, @StringRes Integer num3, @StringRes Integer num4, @NotNull EcoBizName ecoBizName) {
            Intrinsics.checkNotNullParameter(cTAType, "");
            Intrinsics.checkNotNullParameter(ecoBizName, "");
            return new OKIMShareParams(num, num2, z, cTAType, num3, num4, ecoBizName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IMMessageShareModel.CTAType copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OKIMShareParams)) {
                return false;
            }
            OKIMShareParams oKIMShareParams = (OKIMShareParams) obj;
            return Intrinsics.EZpvd(this.gEmmrt, oKIMShareParams.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, oKIMShareParams.KWHzl) && this.AEQbTJ == oKIMShareParams.AEQbTJ && this.OLrzqt == oKIMShareParams.OLrzqt && Intrinsics.EZpvd(this.copydefault, oKIMShareParams.copydefault) && Intrinsics.EZpvd(this.djBIcL, oKIMShareParams.djBIcL) && this.EZpvd == oKIMShareParams.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.gEmmrt;
            int iHashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.KWHzl;
            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
            int iHashCode3 = Boolean.hashCode(this.AEQbTJ);
            int iHashCode4 = this.OLrzqt.hashCode();
            Integer num3 = this.copydefault;
            int iHashCode5 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.djBIcL;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num4 != null ? num4.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OKIMShareParams(shareIMPreviewTitle=" + this.gEmmrt + ", shareIMPreviewContent=" + this.KWHzl + ", shareIMEnabled=" + this.AEQbTJ + ", shareIMCtaType=" + this.OLrzqt + ", shareIMPreviewText=" + this.copydefault + ", shareIMTagline=" + this.djBIcL + ", bizName=" + this.EZpvd + ")";
        }

        public OKIMShareParams(@StringRes Integer num, @StringRes Integer num2, boolean z, @NotNull IMMessageShareModel.CTAType cTAType, @StringRes Integer num3, @StringRes Integer num4, @NotNull EcoBizName ecoBizName) {
            Intrinsics.checkNotNullParameter(cTAType, "");
            Intrinsics.checkNotNullParameter(ecoBizName, "");
            this.gEmmrt = num;
            this.KWHzl = num2;
            this.AEQbTJ = z;
            this.OLrzqt = cTAType;
            this.copydefault = num3;
            this.djBIcL = num4;
            this.EZpvd = ecoBizName;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class EcoBizName {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ EcoBizName[] $VALUES;
            public static final EcoBizName Profile = new EcoBizName("Profile", 0, "oktrading_profile");
            private final String code;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ EcoBizName[] $values() {
                return new EcoBizName[]{Profile};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<EcoBizName> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getCode() {
                return this.code;
            }

            private EcoBizName(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                EcoBizName[] ecoBizNameArr$values = $values();
                $VALUES = ecoBizNameArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(ecoBizNameArr$values);
            }

            public static EcoBizName valueOf(String str) {
                return (EcoBizName) Enum.valueOf(EcoBizName.class, str);
            }

            public static EcoBizName[] values() {
                return (EcoBizName[]) $VALUES.clone();
            }
        }
    }

    public final Object OLrzqt(@NotNull ImageView imageView, boolean z, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (z) {
            InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43251rlk.OLrzqt(InterfaceC8101awQ.class);
            if (interfaceC8101awQ != null) {
                interfaceC8101awQ.copydefault(imageView, false, new ActionBar(cancellableContinuationImpl));
            }
        } else {
            C33054mpH.loadAvatar$default(imageView, str, null, new FragmentManager(cancellableContinuationImpl), 2, null);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
