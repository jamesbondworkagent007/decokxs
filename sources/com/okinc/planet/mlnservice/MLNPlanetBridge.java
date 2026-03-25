package com.okinc.planet.mlnservice;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.C;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.mlnservice.MLNPlanetBridge;
import com.okinc.planet.utils.PublishPreCheck;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.web.WebActivity;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.ActivityC43139rje;
import o.C32866mlf;
import o.C32979mnm;
import o.C33050mpD;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33216msK;
import o.C33492mxV;
import o.C33570myu;
import o.C43084ric;
import o.C43248rlh;
import o.C43251rlk;
import o.C46388tSm;
import o.C46408tTf;
import o.C46437tUh;
import o.C46447tUr;
import o.C47501trL;
import o.C47803twx;
import o.C47813txG;
import o.C48887ueE;
import o.C48891ueI;
import o.C54819xWm;
import o.C55284xgz;
import o.C55298xhM;
import o.C55686xod;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C59449zhJ;
import o.C7322ahe;
import o.C7323ahf;
import o.C7910asj;
import o.C7916asp;
import o.InterfaceC43033rhe;
import o.InterfaceC43294rma;
import o.InterfaceC47278tmy;
import o.InterfaceC48893ueK;
import o.InterfaceC49513upv;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC60037zuM;
import o.InterfaceC7298ahG;
import o.InterfaceC7304ahM;
import o.InterfaceC7835arN;
import o.ViewOnClickListenerC54939xaY;
import o.pTB;
import o.pUU;
import o.qTC;
import o.rTU;
import o.tKX;
import o.tRT;
import o.tTM;
import o.tUB;
import o.tWL;
import o.tWM;
import o.uBU;
import o.wYK;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
@LuaClass
public final class MLNPlanetBridge {
    public final InterfaceC56387yDm OLrzqt;
    public Globals copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public static final ConcurrentHashMap<String, String> EZpvd = new ConcurrentHashMap<>();

    public MLNPlanetBridge(@NotNull Globals globals, @NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(globals, "");
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNPlanetBridge.EZpvd();
            }
        });
        this.copydefault = globals;
    }

    public final InterfaceC7298ahG copydefault() {
        return C7323ahf.KWHzl();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.MLNPlanetBridge.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final InterfaceC47278tmy AEQbTJ() {
        return (InterfaceC47278tmy) this.OLrzqt.getValue();
    }

    public static final InterfaceC47278tmy EZpvd() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    @LuaBridge
    public final LuaValue showSoftKeyBoardView(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (javaString = luaValue.toJavaString()) == null) {
            javaString = "";
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || (javaString2 = luaValue2.toJavaString()) == null) {
            javaString2 = "";
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        final LuaFunction luaFunction = luaValue3 != null ? luaValue3.toLuaFunction() : null;
        pUU.KWHzl("qjf", "replyToName = " + javaString + ",showText = " + javaString2);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        if (activityAEQbTJ instanceof AbstractActivityC33041mov) {
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activityAEQbTJ;
            View viewFindViewById = abstractActivityC33041mov.findViewById(C43084ric.TaskDescription.KWHzl);
            final FrameLayout frameLayout = viewFindViewById instanceof FrameLayout ? (FrameLayout) viewFindViewById : null;
            if (frameLayout == null) {
                LuaValue luaValueNil2 = LuaValue.Nil();
                Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
                return luaValueNil2;
            }
            final View viewInflate = LayoutInflater.from(activityAEQbTJ).inflate(C47501trL.Application.ORxRYg, (ViewGroup) frameLayout, false);
            final FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(C47501trL.TaskDescription.getLabel);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(viewInflate, layoutParams);
            C47803twx c47803twxOLrzqt = C47803twx.Companion.OLrzqt(javaString, 280, javaString2);
            c47803twxOLrzqt.KWHzl(new Function1() { // from class: o.tSF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNPlanetBridge.KWHzl(luaFunction, (java.lang.String) obj);
                }
            });
            c47803twxOLrzqt.copydefault(new Function2() { // from class: o.tSH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return MLNPlanetBridge.copydefault(luaFunction, frameLayout2, frameLayout, viewInflate, (java.lang.String) obj, (java.util.List) obj2);
                }
            });
            FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.add(frameLayout2.getId(), c47803twxOLrzqt, "ReplyInputFragment");
            fragmentTransactionBeginTransaction.commit();
            if (Build.VERSION.SDK_INT >= 30) {
                abstractActivityC33041mov.getWindow().setDecorFitsSystemWindows(false);
                EZpvd(frameLayout);
            } else {
                abstractActivityC33041mov.getWindow().setSoftInputMode(20);
                AEQbTJ(frameLayout);
            }
            InterfaceC7298ahG interfaceC7298ahGCopydefault = copydefault();
            if (interfaceC7298ahGCopydefault != null) {
                interfaceC7298ahGCopydefault.EZpvd("planet_dismiss_key_board", new Activity(frameLayout2, frameLayout, viewInflate), "planet_dismiss_key_board");
            }
            InterfaceC7298ahG interfaceC7298ahGCopydefault2 = copydefault();
            if (interfaceC7298ahGCopydefault2 != null) {
                interfaceC7298ahGCopydefault2.EZpvd("Planet_Post_comment_Notification", new StateListAnimator(frameLayout2, frameLayout, viewInflate), "Planet_Post_comment_Notification");
            }
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    public static final Unit KWHzl(LuaFunction luaFunction, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaString.copydefault(C33129mqd.gEmmrt(str)), LuaBoolean.AEQbTJ(false)});
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(LuaFunction luaFunction, FrameLayout frameLayout, FrameLayout frameLayout2, View view, String str, List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaString.copydefault(C33129mqd.gEmmrt(str)), LuaBoolean.AEQbTJ(true)});
        }
        Intrinsics.copydefault(frameLayout);
        tRT.copydefault(frameLayout);
        Intrinsics.copydefault(view);
        tRT.AEQbTJ(frameLayout2, view);
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC7835arN {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ FrameLayout EZpvd;
        public final /* synthetic */ FrameLayout copydefault;

        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public Activity(FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
            this.copydefault = frameLayout;
            this.EZpvd = frameLayout2;
            this.AEQbTJ = view;
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.KWHzl("qjf", "receive dismiss keyboard event from lua----->");
            FrameLayout frameLayout = this.copydefault;
            Intrinsics.copydefault(frameLayout);
            tRT.copydefault(frameLayout);
            FrameLayout frameLayout2 = this.EZpvd;
            View view = this.AEQbTJ;
            Intrinsics.copydefault(view);
            tRT.AEQbTJ(frameLayout2, view);
            return true;
        }
    }

    public static final class StateListAnimator implements InterfaceC7835arN {
        public final /* synthetic */ FrameLayout AEQbTJ;
        public final /* synthetic */ FrameLayout EZpvd;
        public final /* synthetic */ View copydefault;

        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public StateListAnimator(FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
            this.EZpvd = frameLayout;
            this.AEQbTJ = frameLayout2;
            this.copydefault = view;
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.KWHzl("qjf", "receive begin_scroll event from lua----->params = " + objArr);
            FrameLayout frameLayout = this.EZpvd;
            Intrinsics.copydefault(frameLayout);
            tRT.copydefault(frameLayout);
            FrameLayout frameLayout2 = this.AEQbTJ;
            View view = this.copydefault;
            Intrinsics.copydefault(view);
            tRT.AEQbTJ(frameLayout2, view);
            return true;
        }
    }

    @LuaBridge
    public final LuaValue openPersonalHomepage(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString2 = luaValue.toJavaString()) == null) ? "" : javaString2;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String str2 = (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) ? "" : javaString;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        C46447tUr.openPlanetUserProfilePage$default(C46447tUr.KWHzl, activityAEQbTJ, "", str, "", str2, "feed", null, null, 192, null);
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaValue openPersonalHomepageWithExtraParams(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString2 = luaValue.toJavaString()) == null) ? "" : javaString2;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String str2 = (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) ? "" : javaString;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        Map<String, Object> mapCopydefault = luaValue3 != null ? copydefault(luaValue3) : null;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        C46447tUr.openPlanetUserProfilePage$default(C46447tUr.KWHzl, activityAEQbTJ, "", str, "", str2, "feed", mapCopydefault, null, 128, null);
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaBoolean getPlanetABTest() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(C33216msK.KWHzl.KWHzl());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    @LuaBridge
    public final LuaBoolean isPlanetEnable() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(((tWL) C43251rlk.copydefault(tWL.class)).AhwBna());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public final LuaValue checkPublisherEnable(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        LuaFunction luaFunction = luaValue != null ? luaValue.toLuaFunction() : null;
        ViewGroup viewGroupCopydefault = tUB.copydefault.copydefault();
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == 0) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        if (activityAEQbTJ instanceof ActivityC43139rje) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityAEQbTJ), null, null, new C17471(luaFunction, viewGroupCopydefault, activityAEQbTJ, this, null), 3, null);
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$checkPublisherEnable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C17471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ android.app.Activity $activity;
        final /* synthetic */ ViewGroup $anchorView;
        final /* synthetic */ LuaFunction $callback;
        int label;
        final /* synthetic */ MLNPlanetBridge this$0;

        /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$checkPublisherEnable$1$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PublishPreCheck.values().length];
                try {
                    iArr[PublishPreCheck.CHECK_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PublishPreCheck.NOT_DO_KYC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PublishPreCheck.NEED_MODIFY_PROFILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PublishPreCheck.USER_MUTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PublishPreCheck.CHECK_NET_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PublishPreCheck.CHECK_SHOW_AGREE_TNC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17471(LuaFunction luaFunction, ViewGroup viewGroup, android.app.Activity activity, MLNPlanetBridge mLNPlanetBridge, Continuation<? super C17471> continuation) {
            super(2, continuation);
            this.$callback = luaFunction;
            this.$anchorView = viewGroup;
            this.$activity = activity;
            this.this$0 = mLNPlanetBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17471(this.$callback, this.$anchorView, this.$activity, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
            } else {
                C56391yDq.AEQbTJ(obj);
                tTM ttm = tTM.EZpvd;
                this.label = 1;
                objAEQbTJ = ttm.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            }
            final PublishPreCheck publishPreCheck = (PublishPreCheck) objAEQbTJ;
            switch (ActionBar.copydefault[publishPreCheck.ordinal()]) {
                case 1:
                    LuaFunction luaFunction = this.$callback;
                    if (luaFunction != null) {
                        luaFunction.KWHzl(true);
                    }
                    break;
                case 2:
                    C32866mlf.onEvent$default("Feeds_Btm_KycError_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                    String description = publishPreCheck.getDescription();
                    ViewGroup viewGroup = this.$anchorView;
                    if (viewGroup != null) {
                        MLNPlanetBridge mLNPlanetBridge = this.this$0;
                        final C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroup, description);
                        if (c55284xgzKWHzl != null) {
                            c55284xgzKWHzl.valueOf(mLNPlanetBridge.KWHzl());
                            c55284xgzKWHzl.isConnected(1);
                            c55284xgzKWHzl.djBIcL(1);
                            c55284xgzKWHzl.AEQbTJ(description);
                            c55284xgzKWHzl.EZpvd(C33070mpX.AYXKKw(C47501trL.Fragment.dPnHjp));
                            c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.tSQ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    MLNPlanetBridge.C17471.invokeSuspend$lambda$2$lambda$1$lambda$0(c55284xgzKWHzl, view);
                                }
                            });
                            c55284xgzKWHzl.hDKMBd();
                        }
                    }
                    LuaFunction luaFunction2 = this.$callback;
                    if (luaFunction2 != null) {
                        luaFunction2.KWHzl(false);
                    }
                    break;
                case 3:
                    tKX tkxOLrzqt = tKX.Companion.OLrzqt();
                    final android.app.Activity activity = this.$activity;
                    OrbitEditProfileScenario.CompleteOrbiterProfile completeOrbiterProfile = OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl;
                    final LuaFunction luaFunction3 = this.$callback;
                    tkxOLrzqt.AEQbTJ((FragmentActivity) activity, completeOrbiterProfile, true, new Function2() { // from class: o.tSR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return MLNPlanetBridge.C17471.invokeSuspend$lambda$3(activity, luaFunction3, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                        }
                    });
                    LuaFunction luaFunction4 = this.$callback;
                    if (luaFunction4 != null) {
                        luaFunction4.KWHzl(false);
                    }
                    break;
                case 4:
                    final MLNPlanetBridge mLNPlanetBridge2 = this.this$0;
                    C32866mlf.onEvent$default("Feeds_Btm_DelistedError_View", (TrackChannel[]) null, new Function1() { // from class: o.tST
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return MLNPlanetBridge.C17471.invokeSuspend$lambda$4(mLNPlanetBridge2, (EventParamsList) obj2);
                        }
                    }, 1, (Object) null);
                    String description2 = publishPreCheck.getDescription();
                    ViewGroup viewGroup2 = this.$anchorView;
                    if (viewGroup2 != null) {
                        MLNPlanetBridge mLNPlanetBridge3 = this.this$0;
                        final C55284xgz c55284xgzKWHzl2 = C55284xgz.Companion.KWHzl(viewGroup2, description2);
                        if (c55284xgzKWHzl2 != null) {
                            c55284xgzKWHzl2.valueOf(mLNPlanetBridge3.KWHzl());
                            c55284xgzKWHzl2.isConnected(1);
                            c55284xgzKWHzl2.djBIcL(0);
                            c55284xgzKWHzl2.AEQbTJ(description2);
                            c55284xgzKWHzl2.EZpvd(new View.OnClickListener() { // from class: o.tSV
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    c55284xgzKWHzl2.copydefault();
                                }
                            });
                            c55284xgzKWHzl2.hDKMBd();
                        }
                    }
                    LuaFunction luaFunction5 = this.$callback;
                    if (luaFunction5 != null) {
                        luaFunction5.KWHzl(false);
                    }
                    break;
                case 5:
                    String description3 = publishPreCheck.getDescription();
                    ViewGroup viewGroup3 = this.$anchorView;
                    if (viewGroup3 != null) {
                        MLNPlanetBridge mLNPlanetBridge4 = this.this$0;
                        C55284xgz c55284xgzKWHzl3 = C55284xgz.Companion.KWHzl(viewGroup3, description3);
                        if (c55284xgzKWHzl3 != null) {
                            c55284xgzKWHzl3.valueOf(mLNPlanetBridge4.KWHzl());
                            c55284xgzKWHzl3.isConnected(1);
                            c55284xgzKWHzl3.djBIcL(0);
                            c55284xgzKWHzl3.AEQbTJ(description3);
                            c55284xgzKWHzl3.hDKMBd();
                        }
                    }
                    LuaFunction luaFunction6 = this.$callback;
                    if (luaFunction6 != null) {
                        luaFunction6.KWHzl(false);
                    }
                    break;
                case 6:
                    C32866mlf.onEvent$default("Feeds_Mid_TnC_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                    LuaFunction luaFunction7 = this.$callback;
                    if (luaFunction7 != null) {
                        luaFunction7.KWHzl(false);
                    }
                    View viewInflate = LayoutInflater.from(this.$activity).inflate(C47501trL.Application.DTwDnp, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                    final wYK wyk = (wYK) viewInflate.findViewById(C47501trL.TaskDescription.OxVOHk);
                    wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tSS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                            wyk.setError(false);
                        }
                    });
                    String strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.getUserContextRegisteredStatus);
                    String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.fupbxE, C56423yEv.EZpvd(C56390yDp.OLrzqt("termsConditions", strAYXKKw)));
                    String[] strArr = {strAYXKKw};
                    final android.app.Activity activity2 = this.$activity;
                    wyk.setText(C33061mpO.setupSpanStyles$default(strCopydefault, strArr, 0, null, false, new Function1() { // from class: o.tSW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return MLNPlanetBridge.C17471.invokeSuspend$lambda$11(activity2, (java.util.List) obj2);
                        }
                    }, 14, null));
                    wyk.setMovementMethod(LinkMovementMethod.getInstance());
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.$activity);
                    final LuaFunction luaFunction8 = this.$callback;
                    final ViewGroup viewGroup4 = this.$anchorView;
                    final MLNPlanetBridge mLNPlanetBridge5 = this.this$0;
                    viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.hlXVux));
                    viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.pauseLocationServices));
                    String string = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.fJNWhG);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.tSU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            MLNPlanetBridge.C17471.invokeSuspend$lambda$14$lambda$12(wyk, viewOnClickListenerC54939xaY, luaFunction8, publishPreCheck, viewGroup4, mLNPlanetBridge5, view);
                        }
                    });
                    String string2 = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.ejfBZ);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.tSX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            viewOnClickListenerC54939xaY.dismiss();
                        }
                    });
                    viewOnClickListenerC54939xaY.EZpvd(viewInflate);
                    viewOnClickListenerC54939xaY.show();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1$lambda$0(C55284xgz c55284xgz, View view) {
            rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
            Context contextGEmmrt = c55284xgz.gEmmrt();
            Intrinsics.checkNotNullExpressionValue(contextGEmmrt, "");
            rTU.Application.openKYCUserCenter$default(rtu, contextGEmmrt, null, 2, null);
            c55284xgz.copydefault();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invokeSuspend$lambda$3(android.app.Activity activity, LuaFunction luaFunction, boolean z, String str) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new MLNPlanetBridge$checkPublisherEnable$1$2$1(luaFunction, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(MLNPlanetBridge mLNPlanetBridge, EventParamsList eventParamsList) {
            String username;
            User userOLrzqt = mLNPlanetBridge.AEQbTJ().OLrzqt();
            if (userOLrzqt == null || (username = userOLrzqt.getUsername()) == null) {
                username = "";
            }
            EventParamsList.put$default(eventParamsList, "user_profile_name", username, false, 4, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$checkPublisherEnable$1$StateListAnimator */
        public static final class StateListAnimator extends ClickableSpan {
            public final /* synthetic */ android.app.Activity AEQbTJ;

            public StateListAnimator(android.app.Activity activity) {
                this.AEQbTJ = activity;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Intrinsics.checkNotNullParameter(view, "");
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47501trL.Fragment.init))), null, 4, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                textPaint.setUnderlineText(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$11(android.app.Activity activity, List list) {
            list.add(new StateListAnimator(activity));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$14$lambda$12(wYK wyk, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LuaFunction luaFunction, PublishPreCheck publishPreCheck, ViewGroup viewGroup, MLNPlanetBridge mLNPlanetBridge, View view) {
            if (wyk.isChecked()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new MLNPlanetBridge$checkPublisherEnable$1$dialog$1$1$1(wyk, luaFunction, viewOnClickListenerC54939xaY, publishPreCheck, viewGroup, mLNPlanetBridge, null), 3, null);
            } else {
                wyk.setError(true);
            }
        }
    }

    @LuaBridge
    public final LuaBoolean isShowPublisher() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(((tWM) C43251rlk.copydefault(tWM.class)).valueOf());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    @LuaBridge
    public final LuaValue setMemoryCache(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String strGEmmrt = C33129mqd.gEmmrt(luaValue != null ? luaValue.toJavaString() : null);
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String strGEmmrt2 = C33129mqd.gEmmrt(luaValue2 != null ? luaValue2.toJavaString() : null);
        if (StringsKt__StringsKt.fARcdN((CharSequence) strGEmmrt)) {
            LuaValue luaValueFalse = LuaValue.False();
            Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
            return luaValueFalse;
        }
        EZpvd.put(strGEmmrt, strGEmmrt2);
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaValue getMemoryCache(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String strGEmmrt = C33129mqd.gEmmrt(luaValue != null ? luaValue.toJavaString() : null);
        if (StringsKt__StringsKt.fARcdN((CharSequence) strGEmmrt)) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        String str = EZpvd.get(strGEmmrt);
        if (str == null) {
            LuaValue luaValueNil2 = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
            return luaValueNil2;
        }
        LuaValue luaValueCopydefault = LuaString.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @LuaBridge
    public final LuaValue showPublisher(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString = luaValue.toJavaString()) == null) ? "" : javaString;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        Map<String, Object> mapCopydefault = luaValue2 != null ? copydefault(luaValue2) : null;
        pUU.KWHzl("qjf", "showPublisher channelId = " + str + ", channelData = " + mapCopydefault);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == 0) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        if (activityAEQbTJ instanceof AbstractActivityC33041mov) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityAEQbTJ), null, null, new C17491(activityAEQbTJ, str, mapCopydefault, (FrameLayout) ((AbstractActivityC33041mov) activityAEQbTJ).findViewById(C43084ric.TaskDescription.KWHzl), null), 3, null);
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$showPublisher$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ android.app.Activity $activity;
        final /* synthetic */ Map<String, Object> $channelData2Map;
        final /* synthetic */ String $channelId;
        final /* synthetic */ FrameLayout $frameLayout;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17491(android.app.Activity activity, String str, Map<String, ? extends Object> map, FrameLayout frameLayout, Continuation<? super C17491> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$channelId = str;
            this.$channelData2Map = map;
            this.$frameLayout = frameLayout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17491(this.$activity, this.$channelId, this.$channelData2Map, this.$frameLayout, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.tWM.StateListAnimator.openPublishPage$default(o.tWM, android.content.Context, com.okinc.planet_api.publisher.PlanetPublisherChannelId, java.util.Map, android.view.View, android.os.Bundle, boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tWM twm = (tWM) C43251rlk.copydefault(tWM.class);
                android.app.Activity activity = this.$activity;
                PlanetPublisherChannelId planetPublisherChannelIdAEQbTJ = PlanetPublisherChannelId.Companion.AEQbTJ(this.$channelId);
                Map<String, Object> map = this.$channelData2Map;
                FrameLayout frameLayout = this.$frameLayout;
                this.label = 1;
                if (tWM.StateListAnimator.openPublishPage$default(twm, activity, planetPublisherChannelIdAEQbTJ, map, frameLayout, null, false, this, 48, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @LuaBridge
    public final LuaBoolean checkIsOrbiter() {
        boolean zAhwBna = C46388tSm.Companion.KWHzl().AhwBna();
        ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (componentCallbacks2AEQbTJ != null && (componentCallbacks2AEQbTJ instanceof AbstractActivityC33041mov)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2AEQbTJ), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        }
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(zAhwBna);
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$checkIsOrbiter$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
                this.label = 1;
                if (c46388tSmKWHzl.EZpvd(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @LuaBridge
    public final LuaBoolean checkIsOrbiterCached() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(C46388tSm.Companion.KWHzl().AhwBna());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    @LuaBridge
    public final LuaValue openOrbiterUpgradeFlow(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        final LuaFunction luaFunction = luaValue != null ? luaValue.toLuaFunction() : null;
        if (!C46388tSm.Companion.KWHzl().AhwBna()) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null && (activityAEQbTJ instanceof FragmentActivity)) {
                tWL.Application.openOrbiterUpgradeFlow$default((tWL) C43251rlk.copydefault(tWL.class), (FragmentActivity) activityAEQbTJ, null, true, new Function1() { // from class: o.tSC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MLNPlanetBridge.AEQbTJ(luaFunction, (kotlin.Pair) obj);
                    }
                }, 2, null);
            } else if (luaFunction != null) {
                luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(2)});
            }
        } else if (luaFunction != null) {
            luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(0)});
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        if (zBooleanValue) {
            if (luaFunction != null) {
                luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(0)});
            }
        } else if (luaFunction != null) {
            luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(2)});
        }
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaBoolean isOrbiterUpgradeCheckRequired() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(C46437tUh.OLrzqt.AEQbTJ());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    @LuaBridge
    public final LuaValue openProfileEditPage(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (javaString = luaValue.toJavaString()) == null) {
            javaString = "";
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        boolean z = luaValue2 != null ? luaValue2.toBoolean() : false;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        final LuaFunction luaFunction = luaValue3 != null ? luaValue3.toLuaFunction() : null;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null && (activityAEQbTJ instanceof FragmentActivity)) {
            tKX tkxOLrzqt = tKX.Companion.OLrzqt();
            tkxOLrzqt.AEQbTJ((FragmentActivity) activityAEQbTJ, tkxOLrzqt.copydefault(javaString), z, new Function2() { // from class: o.tSz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return MLNPlanetBridge.AEQbTJ(luaFunction, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
        } else if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false)});
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction, boolean z, String str) {
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(z)});
        }
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaBoolean isProfileModified() {
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(C46388tSm.Companion.KWHzl().valueOf());
        Intrinsics.copydefault(luaValueAEQbTJ, "");
        return (LuaBoolean) luaValueAEQbTJ;
    }

    @LuaBridge
    public final LuaValue showSnackBar(@NotNull LuaValue[] luaValueArr) {
        final C55284xgz c55284xgzKWHzl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        int i = luaValue != null ? luaValue.toInt() : 1;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String strGEmmrt = C33129mqd.gEmmrt(luaValue2 != null ? luaValue2.toJavaString() : null);
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String strGEmmrt2 = C33129mqd.gEmmrt(luaValue3 != null ? luaValue3.toJavaString() : null);
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        final LuaFunction luaFunction = luaValue4 != null ? luaValue4.toLuaFunction() : null;
        ViewGroup viewGroupCopydefault = tUB.copydefault.copydefault();
        if (viewGroupCopydefault != null && (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroupCopydefault, strGEmmrt)) != null) {
            c55284xgzKWHzl.valueOf(KWHzl());
            c55284xgzKWHzl.isConnected(i);
            c55284xgzKWHzl.AEQbTJ(strGEmmrt);
            if (C33129mqd.OLrzqt((CharSequence) strGEmmrt2)) {
                c55284xgzKWHzl.djBIcL(1);
                c55284xgzKWHzl.EZpvd(strGEmmrt2);
                c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.tSv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        MLNPlanetBridge.EZpvd(luaFunction, c55284xgzKWHzl, view);
                    }
                });
            }
            c55284xgzKWHzl.hDKMBd();
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    public static final void EZpvd(LuaFunction luaFunction, C55284xgz c55284xgz, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        c55284xgz.copydefault();
    }

    @LuaBridge
    public final LuaValue dashboardReport(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String strGEmmrt = C33129mqd.gEmmrt(luaValue != null ? luaValue.toJavaString() : null);
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        Map<String, Object> mapCopydefault = luaValue2 != null ? copydefault(luaValue2) : null;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String strGEmmrt2 = C33129mqd.gEmmrt(luaValue3 != null ? luaValue3.toJavaString() : null);
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        String strGEmmrt3 = C33129mqd.gEmmrt(luaValue4 != null ? luaValue4.toJavaString() : null);
        EventData eventData = new EventData();
        eventData.setAct(strGEmmrt);
        eventData.setPath(strGEmmrt2);
        eventData.setMsg(strGEmmrt3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mapCopydefault != null) {
            for (Map.Entry<String, Object> entry : mapCopydefault.entrySet()) {
                linkedHashMap.put(entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
            }
        }
        eventData.setAttrs(linkedHashMap);
        pUU.KWHzl("qjf", "attrMap = " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    public final int KWHzl() {
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        pUU.KWHzl("qjf", "getNavigationBarHeight = " + C33570myu.KWHzl(c32979mnm.OLrzqt()));
        return C55298xhM.dp2px$default(64.0f, null, 1, null) - C33570myu.KWHzl(c32979mnm.OLrzqt());
    }

    public final void EZpvd(View view, int i) {
        view.setPadding(0, 0, 0, i);
    }

    public final void OLrzqt(View view) {
        view.setPadding(0, 0, 0, 0);
    }

    public final void EZpvd(FrameLayout frameLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: o.tSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return MLNPlanetBridge.AEQbTJ(this.OLrzqt, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(MLNPlanetBridge mLNPlanetBridge, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        pUU.KWHzl("qjf", "setupModernKeyboardHandling-imeInsets = " + insets.bottom + ",navigationBars = " + insets2.bottom);
        int i = insets.bottom;
        int i2 = insets2.bottom;
        if (i > 0) {
            mLNPlanetBridge.EZpvd(view, i - i2);
        } else {
            mLNPlanetBridge.OLrzqt(view);
        }
        return windowInsetsCompat;
    }

    public static final class TaskDescription implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ FrameLayout AEQbTJ;
        public final /* synthetic */ Ref.IntRef OLrzqt;
        public final /* synthetic */ MLNPlanetBridge copydefault;

        public TaskDescription(FrameLayout frameLayout, Ref.IntRef intRef, MLNPlanetBridge mLNPlanetBridge) {
            this.AEQbTJ = frameLayout;
            this.OLrzqt = intRef;
            this.copydefault = mLNPlanetBridge;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.AEQbTJ.getWindowVisibleDisplayFrame(rect);
            int height = this.AEQbTJ.getHeight();
            int i = height - rect.bottom;
            Ref.IntRef intRef = this.OLrzqt;
            if (i != intRef.element) {
                intRef.element = i;
                if (i > ((double) height) * 0.15d) {
                    this.copydefault.EZpvd(this.AEQbTJ, i);
                } else {
                    this.copydefault.OLrzqt(this.AEQbTJ);
                }
            }
        }
    }

    public final void AEQbTJ(FrameLayout frameLayout) {
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new TaskDescription(frameLayout, new Ref.IntRef(), this));
    }

    public final Map<String, Object> copydefault(LuaValue luaValue) {
        return C7916asp.OLrzqt(luaValue.toLuaTable());
    }

    @LuaBridge
    public final LuaNumber a_measureTextHeight(@NotNull LuaValue[] luaValueArr) {
        Context context;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        try {
            Globals globals = this.copydefault;
            InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
            C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
            if (c7322ahe != null && (context = c7322ahe.AEQbTJ) != null) {
                String javaString = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
                String javaString2 = luaValueArr[1].toJavaString();
                float f = luaValueArr[2].toFloat();
                int i = luaValueArr[3].toInt();
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(f);
                float fApplyDimension = TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
                InterfaceC7304ahM interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ();
                if (interfaceC7304ahMEjfBZ != null) {
                    textPaint.setTextSize(fApplyDimension);
                    textPaint.setTypeface(interfaceC7304ahMEjfBZ.KWHzl(javaString2));
                }
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(javaString, 0, javaString.length(), textPaint, C55298xhM.dpInt$default(i, (Context) null, 1, (Object) null)).setText(javaString).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
                LuaNumber luaNumberValueOf = LuaNumber.valueOf(C55298xhM.px2dp$default(staticLayoutBuild.getHeight(), (Context) null, 1, (Object) null));
                Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
                return luaNumberValueOf;
            }
            LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
            return luaNumberValueOf2;
        } catch (Exception unused) {
            LuaNumber luaNumberValueOf3 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf3, "");
            return luaNumberValueOf3;
        }
    }

    @LuaBridge
    public final LuaNumber isKlineThemeMode() {
        String string = SPUtils.getString("kline_theme_type", "kline_dark");
        if (Intrinsics.EZpvd((Object) string, (Object) "kline_white")) {
            LuaNumber luaNumberValueOf = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
            return luaNumberValueOf;
        }
        if (Intrinsics.EZpvd((Object) string, (Object) "kline_dark")) {
            LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(1);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
            return luaNumberValueOf2;
        }
        LuaNumber luaNumberValueOf3 = C33492mxV.OLrzqt() ? LuaNumber.valueOf(1) : LuaNumber.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(luaNumberValueOf3, "");
        return luaNumberValueOf3;
    }

    @LuaBridge
    public final LuaValue getStableCoin() {
        LuaValue luaValueCopydefault = LuaString.copydefault(qTC.copydefault.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue triggerVibration() {
        Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i >= 29) {
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createOneShot(100L, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384));
                }
            } else if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
            }
        } else if (vibrator != null) {
            vibrator.vibrate(100L);
        }
        LuaValue luaValueNil = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
        return luaValueNil;
    }

    @LuaBridge
    public final LuaValue getProductABSwitch(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValueCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueCopydefault2 = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
            return luaValueCopydefault2;
        }
        String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, javaString, null, 2, null);
        if (value$default != null && (luaValueCopydefault = LuaString.copydefault(value$default)) != null) {
            return luaValueCopydefault;
        }
        LuaValue luaValueCopydefault3 = LuaString.copydefault("");
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault3, "");
        return luaValueCopydefault3;
    }

    @LuaBridge
    public final LuaValue getGrayABSwitch(@NotNull LuaValue[] luaValueArr) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(false);
            Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ, "");
            return luaValueAEQbTJ;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, javaString, null, 2, null), "treatment", false, 2, null)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        LuaValue luaValueAEQbTJ2 = LuaBoolean.AEQbTJ(((Boolean) objM7377constructorimpl).booleanValue());
        Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ2, "");
        return luaValueAEQbTJ2;
    }

    @LuaBridge
    public final LuaValue getCurrentUsername(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValueCopydefault = LuaString.copydefault(C55686xod.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue shareFeedDetail(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        String str = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
        if (str == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil2 = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
            return luaValueNil2;
        }
        luaMarketShare$default(this, (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class), str, "", "market_feed_detail", Uri.parse(str).getQueryParameter("deeplink"), activityAEQbTJ, null, 64, null);
        LuaValue luaValueNil3 = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil3, "");
        return luaValueNil3;
    }

    @LuaBridge
    public final LuaValue sharePageSnapshot(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String javaString3;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString4 = luaValue != null ? luaValue.toJavaString() : null;
        String str = C33129mqd.OLrzqt((CharSequence) javaString4) ? javaString4 : null;
        if (str == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil2 = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
            return luaValueNil2;
        }
        String strAEQbTJ = AEQbTJ(str);
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
            javaString = "market_feed_detail";
        }
        String str2 = javaString;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String str3 = (luaValue3 == null || (javaString3 = luaValue3.toJavaString()) == null) ? "" : javaString3;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        KWHzl(interfaceC48893ueK, str, str3, str2, strAEQbTJ, activityAEQbTJ, (luaValue4 == null || (javaString2 = luaValue4.toJavaString()) == null) ? "" : javaString2);
        LuaValue luaValueNil3 = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil3, "");
        return luaValueNil3;
    }

    public final String AEQbTJ(String str) {
        try {
            String strDecode = URLDecoder.decode(StringsKt__StringsKt.substringAfter$default(str, "deeplink=", (String) null, 2, (Object) null), C.UTF8_NAME);
            Intrinsics.copydefault((Object) strDecode);
            return strDecode;
        } catch (Exception e) {
            pUU.AEQbTJ("OKPlanetBridge", "parseComplexUrl failed", e);
            return "";
        }
    }

    public static /* synthetic */ void luaMarketShare$default(MLNPlanetBridge mLNPlanetBridge, InterfaceC48893ueK interfaceC48893ueK, String str, String str2, String str3, String str4, android.app.Activity activity, String str5, int i, Object obj) {
        mLNPlanetBridge.KWHzl(interfaceC48893ueK, str, str2, str3, str4, activity, (i & 64) != 0 ? null : str5);
    }

    public final void KWHzl(InterfaceC48893ueK interfaceC48893ueK, String str, final String str2, final String str3, final String str4, final android.app.Activity activity, final String str5) {
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        if (interfaceC48893ueK == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(str, new C48891ueI(str3, str4, false, null, null, 28, null))) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: o.tSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.KWHzl(activity, str3, str5, str2, str4, (C48887ueE) obj);
            }
        };
        InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MLNPlanetBridge.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.tSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MLNPlanetBridge.valueOf(function12, obj);
            }
        });
        if (interfaceC58217yxCAEQbTJ != null) {
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, activity);
        }
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.app.Activity activity, final String str, final String str2, final String str3, final String str4, final C48887ueE c48887ueE) {
        pUU.EZpvd("OKPlanetBridge", "short link created: " + c48887ueE.OLrzqt());
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.tSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.copydefault(c48887ueE, str, str2, str3, str4, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.tSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.AEQbTJ((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfigCopydefault), false, 0.0f, false, null, null, 62, null);
        ISharePreviewConfig previewConfig = shareConfigCopydefault.getPreviewConfig();
        ImageCustomPreviewConfig imageCustomPreviewConfig = previewConfig instanceof ImageCustomPreviewConfig ? (ImageCustomPreviewConfig) previewConfig : null;
        if (imageCustomPreviewConfig != null) {
            imageCustomPreviewConfig.setPreviewBottomTips("");
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            Intrinsics.copydefault(activity, "");
            interfaceC48893ueK.OLrzqt((AbstractActivityC33041mov) activity, multiShareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C48887ueE c48887ueE, String str, String str2, String str3, String str4, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom(str);
        imageShareParams.getExtras().putString("SHARE_SHORT_LINK", c48887ueE.OLrzqt());
        imageShareParams.getExtras().putBoolean("isFixedSize", false);
        imageShareParams.getExtras().putString("luaPageName", "/feed/tokenInsight");
        imageShareParams.getExtras().putString("token", str2);
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel(str3 + " " + C33070mpX.AYXKKw(C47501trL.Fragment.DarRvM), C33070mpX.AYXKKw(C47501trL.Fragment.DuXjdv), C33070mpX.AYXKKw(C47501trL.Fragment.DarRvM), (String) null, (String) null, str4, c48887ueE.OLrzqt(), C33070mpX.AYXKKw(C47501trL.Fragment.DCUTEI), IMMessageShareModel.CTAType.ViewMore, (Map) null, "okmarket_feed_ai_insight", 536, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C47813txG.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        pUU.AEQbTJ("OKPlanetBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final void filterUserPreFeed(@NotNull LuaValue[] luaValueArr) {
        LuaTable luaTable;
        LuaValue luaValue;
        final LuaFunction luaFunction;
        LuaValue luaValue2;
        String javaString;
        InterfaceC43033rhe interfaceC43033rhe;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue3 == null || (luaTable = luaValue3.toLuaTable()) == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (luaFunction = luaValue.toLuaFunction()) == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null || (javaString = luaValue2.toJavaString()) == null) {
            return;
        }
        List listCopydefault = C7910asj.copydefault(luaTable);
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        Iterator it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        Globals globals = this.copydefault;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov == null || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null) {
            return;
        }
        interfaceC43033rhe.copydefault(abstractActivityC33041mov, javaString, arrayList, new Function1() { // from class: o.tSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.KWHzl(luaFunction, (java.util.List) obj);
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Globals globals = luaFunction.getGlobals();
        if (globals == null) {
            return Unit.INSTANCE;
        }
        LuaTable luaTableOLrzqt = C7910asj.OLrzqt(globals, list);
        Intrinsics.checkNotNullExpressionValue(luaTableOLrzqt, "");
        luaFunction.invoke(LuaValue.varargsOf(luaTableOLrzqt));
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaValue showFeedDetailSharingDialog(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        MLNPlanetBridge mLNPlanetBridge;
        final boolean z;
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        String javaString3;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            final String str = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
            if (str != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                final String str2 = (luaValue2 == null || (javaString3 = luaValue2.toJavaString()) == null || !C33129mqd.OLrzqt((CharSequence) javaString3)) ? null : javaString3;
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
                if (luaValue3 != null && (javaString2 = luaValue3.toJavaString()) != null) {
                    if (!C33129mqd.OLrzqt((CharSequence) javaString2)) {
                        javaString2 = null;
                    }
                    if (javaString2 != null) {
                        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
                        if (luaValue4 != null) {
                            z = luaValue4.toBoolean();
                            mLNPlanetBridge = this;
                        } else {
                            mLNPlanetBridge = this;
                            z = true;
                        }
                        Globals globals = mLNPlanetBridge.copydefault;
                        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
                        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
                        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
                        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                        if (abstractActivityC33041mov == null) {
                            LuaValue luaValueFalse = LuaValue.False();
                            Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
                            return luaValueFalse;
                        }
                        String queryParameter = Uri.parse(javaString2).getQueryParameter("deeplink");
                        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
                        if (interfaceC48893ueK != null && (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(javaString2, new C48891ueI("market_feed_detail", queryParameter, false, null, null, 28, null))) != null) {
                            final String str3 = "market_feed_detail";
                            final AbstractActivityC33041mov abstractActivityC33041mov2 = abstractActivityC33041mov;
                            final Function1 function1 = new Function1() { // from class: o.tSr
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return MLNPlanetBridge.KWHzl(abstractActivityC33041mov2, str3, str, str2, z, (C48887ueE) obj);
                                }
                            };
                            InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tSt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    MLNPlanetBridge.djBIcL(function1, obj);
                                }
                            };
                            final Function1 function12 = new Function1() { // from class: o.tSu
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return MLNPlanetBridge.KWHzl((java.lang.Throwable) obj);
                                }
                            };
                            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tSw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    MLNPlanetBridge.AYXKKw(function12, obj);
                                }
                            });
                            if (interfaceC58217yxCAEQbTJ != null) {
                                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, abstractActivityC33041mov);
                            }
                        }
                        LuaValue luaValueTrue = LuaValue.True();
                        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
                        return luaValueTrue;
                    }
                }
                LuaValue luaValueFalse2 = LuaValue.False();
                Intrinsics.checkNotNullExpressionValue(luaValueFalse2, "");
                return luaValueFalse2;
            }
        }
        LuaValue luaValueFalse3 = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse3, "");
        return luaValueFalse3;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, final String str, final String str2, final String str3, final boolean z, final C48887ueE c48887ueE) {
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.tSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.KWHzl(c48887ueE, str, str2, str3, z, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.tSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.EZpvd((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfigCopydefault), false, 0.0f, false, null, null, 62, null);
        ISharePreviewConfig previewConfig = shareConfigCopydefault.getPreviewConfig();
        ImageCustomPreviewConfig imageCustomPreviewConfig = previewConfig instanceof ImageCustomPreviewConfig ? (ImageCustomPreviewConfig) previewConfig : null;
        if (imageCustomPreviewConfig != null) {
            imageCustomPreviewConfig.setPreviewBottomTips("");
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.OLrzqt(abstractActivityC33041mov, multiShareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C48887ueE c48887ueE, String str, String str2, String str3, boolean z, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom(str);
        imageShareParams.getExtras().putString("id", str2);
        imageShareParams.getExtras().putString("data", str3);
        imageShareParams.getExtras().putBoolean("isFixedSize", z);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C47813txG.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        pUU.AEQbTJ("OKPlanetBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue showFeedDetailSharingDialogToIM(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String lowerCase;
        final String str;
        String javaString3;
        final String str2;
        String str3;
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        String javaString4;
        String javaString5;
        String javaString6;
        String javaString7;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            final String str4 = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
            if (str4 != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                final String str5 = (luaValue2 == null || (javaString7 = luaValue2.toJavaString()) == null || !C33129mqd.OLrzqt((CharSequence) javaString7)) ? null : javaString7;
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
                if (luaValue3 != null && (javaString2 = luaValue3.toJavaString()) != null) {
                    if (!C33129mqd.OLrzqt((CharSequence) javaString2)) {
                        javaString2 = null;
                    }
                    if (javaString2 != null) {
                        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
                        final boolean z = luaValue4 != null ? luaValue4.toBoolean() : true;
                        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
                        if (luaValue5 == null || (javaString6 = luaValue5.toJavaString()) == null) {
                            lowerCase = SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER;
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString6)) {
                                javaString6 = null;
                            }
                            if (javaString6 != null) {
                                lowerCase = javaString6.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                if (lowerCase == null) {
                                }
                            }
                        }
                        final String str6 = lowerCase;
                        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
                        if (luaValue6 == null || (javaString5 = luaValue6.toJavaString()) == null) {
                            str = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString5)) {
                                javaString5 = null;
                            }
                            if (javaString5 != null) {
                                str = javaString5;
                            }
                        }
                        LuaValue luaValue7 = (LuaValue) yDV.gEmmrt(luaValueArr, 6);
                        if (luaValue7 == null || (javaString3 = luaValue7.toJavaString()) == null) {
                            javaString3 = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString3)) {
                                javaString3 = null;
                            }
                            if (javaString3 == null) {
                            }
                        }
                        final String string = StringsKt__StringsKt.hDKMBd((CharSequence) new Regex("[\r\n]+|<[^>]+>").replace(javaString3, "")).toString();
                        LuaValue luaValue8 = (LuaValue) yDV.gEmmrt(luaValueArr, 7);
                        if (luaValue8 == null || (javaString4 = luaValue8.toJavaString()) == null) {
                            str2 = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString4)) {
                                javaString4 = null;
                            }
                            if (javaString4 != null) {
                                str2 = javaString4;
                            }
                        }
                        LuaValue luaValue9 = (LuaValue) yDV.gEmmrt(luaValueArr, 8);
                        final boolean z2 = luaValue9 != null ? luaValue9.toBoolean() : true;
                        pUU.KWHzl("OKPlanetBridge", "IM sourcePlatform = " + str6 + ", translatedTitle = " + str + " format:" + string + " , translatedContent = " + javaString3 + ", author = " + str2);
                        Globals globals = this.copydefault;
                        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
                        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
                        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
                        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                        if (abstractActivityC33041mov == null) {
                            LuaValue luaValueFalse = LuaValue.False();
                            Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
                            return luaValueFalse;
                        }
                        final String queryParameter = Uri.parse(javaString2).getQueryParameter("deeplink");
                        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
                        if (interfaceC48893ueK == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(javaString2, new C48891ueI("market_feed_detail", queryParameter, false, null, null, 28, null))) == null) {
                            str3 = "";
                        } else {
                            final String str7 = "market_feed_detail";
                            final AbstractActivityC33041mov abstractActivityC33041mov2 = abstractActivityC33041mov;
                            str3 = "";
                            final Function1 function1 = new Function1() { // from class: o.tSM
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return MLNPlanetBridge.copydefault(abstractActivityC33041mov2, str7, str4, str5, z, z2, str6, str2, str, queryParameter, string, (C48887ueE) obj);
                                }
                            };
                            InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tSN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    MLNPlanetBridge.fetchVPNInfo(function1, obj);
                                }
                            };
                            final Function1 function12 = new Function1() { // from class: o.tSP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return MLNPlanetBridge.AYXKKw((java.lang.Throwable) obj);
                                }
                            };
                            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tSO
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    MLNPlanetBridge.values(function12, obj);
                                }
                            });
                            if (interfaceC58217yxCAEQbTJ != null) {
                                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, abstractActivityC33041mov);
                            }
                        }
                        LuaValue luaValueTrue = LuaValue.True();
                        Intrinsics.checkNotNullExpressionValue(luaValueTrue, str3);
                        return luaValueTrue;
                    }
                }
                LuaValue luaValueFalse2 = LuaValue.False();
                Intrinsics.checkNotNullExpressionValue(luaValueFalse2, "");
                return luaValueFalse2;
            }
        }
        LuaValue luaValueFalse3 = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse3, "");
        return luaValueFalse3;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, final String str, final String str2, final String str3, final boolean z, final boolean z2, final String str4, final String str5, final String str6, final String str7, final String str8, final C48887ueE c48887ueE) {
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.tSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.KWHzl(c48887ueE, str, str2, str3, z, z2, str4, str5, str6, str7, str8, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.tSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPlanetBridge.gEmmrt((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfigCopydefault), false, 0.0f, false, null, null, 62, null);
        ISharePreviewConfig previewConfig = shareConfigCopydefault.getPreviewConfig();
        ImageCustomPreviewConfig imageCustomPreviewConfig = previewConfig instanceof ImageCustomPreviewConfig ? (ImageCustomPreviewConfig) previewConfig : null;
        if (imageCustomPreviewConfig != null) {
            imageCustomPreviewConfig.setPreviewBottomTips("");
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.OLrzqt(abstractActivityC33041mov, multiShareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C48887ueE c48887ueE, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom(str);
        imageShareParams.getExtras().putString("SHARE_SHORT_LINK", c48887ueE.OLrzqt());
        imageShareParams.getExtras().putString("id", str2);
        imageShareParams.getExtras().putString("data", str3);
        imageShareParams.getExtras().putBoolean("isFixedSize", z);
        imageShareParams.getExtras().putBoolean("showTranslatedContent", z2);
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        String str9 = Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) ? "okmarket_content_twitter_feed" : "okmarket_content_news_feed";
        imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel((Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) || Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX)) ? str5 : str6, str8, C33070mpX.AYXKKw((Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) || Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX)) ? C47501trL.Fragment.getPostValueLengthLimit : C47501trL.Fragment.OqFWZa), "", (String) null, str7 == null ? "" : str7, (String) null, C33070mpX.AYXKKw(C47501trL.Fragment.DCUTEI), IMMessageShareModel.CTAType.ViewMore, (Map) null, str9, 592, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C47813txG.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(Throwable th) {
        pUU.AEQbTJ("OKPlanetBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaValue notifyEvent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            String str = null;
            if (!C33129mqd.OLrzqt((CharSequence) javaString)) {
                javaString = null;
            }
            if (javaString != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                if (luaValue2 != null && (javaString2 = luaValue2.toJavaString()) != null && C33129mqd.OLrzqt((CharSequence) javaString2)) {
                    str = javaString2;
                }
                new C46408tTf(javaString, str).KWHzl();
                LuaValue luaValueTrue = LuaValue.True();
                Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
                return luaValueTrue;
            }
        }
        LuaValue luaValueFalse = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
        return luaValueFalse;
    }

    @LuaBridge
    public final LuaValue formatQuantity(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueCopydefault = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
            return luaValueCopydefault;
        }
        LuaValue luaValueCopydefault2 = LuaString.copydefault(pTB.formatLocalized$default(javaString, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
        return luaValueCopydefault2;
    }

    @LuaBridge
    public final LuaValue clearViewClick(@NotNull LuaValue[] luaValueArr) {
        View viewF_;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        LuaUserdata userdata = luaValue != null ? luaValue.toUserdata() : null;
        UDView uDView = userdata instanceof UDView ? (UDView) userdata : null;
        if (uDView != null && (viewF_ = uDView.f_()) != null) {
            viewF_.setOnClickListener(null);
            viewF_.setClickable(false);
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaValue goToPluginDetail(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (componentCallbacks2AEQbTJ == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String javaString2 = luaValue2 != null ? luaValue2.toJavaString() : null;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String javaString3 = luaValue3 != null ? luaValue3.toJavaString() : null;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        LuaFunction luaFunction = luaValue4 != null ? luaValue4.toLuaFunction() : null;
        if (componentCallbacks2AEQbTJ instanceof AbstractActivityC33041mov) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2AEQbTJ), null, null, new C17481(javaString, javaString3, javaString2, luaFunction, null), 3, null);
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    /* JADX INFO: renamed from: com.okinc.planet.mlnservice.MLNPlanetBridge$goToPluginDetail$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LuaFunction $callback;
        final /* synthetic */ String $deeplink;
        final /* synthetic */ String $metadata;
        final /* synthetic */ String $pluginType;
        Object L$0;
        Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17481(String str, String str2, String str3, LuaFunction luaFunction, Continuation<? super C17481> continuation) {
            super(2, continuation);
            this.$deeplink = str;
            this.$pluginType = str2;
            this.$metadata = str3;
            this.$callback = luaFunction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17481(this.$deeplink, this.$pluginType, this.$metadata, this.$callback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            final String str;
            final LuaFunction luaFunction;
            LuaFunction luaFunction2;
            LuaFunction luaFunction3;
            LuaFunction luaFunction4;
            String str2;
            String str3;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            LuaValue[] luaValueArrInvoke = null;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                str = this.$deeplink;
                if (str != null) {
                    String str4 = this.$pluginType;
                    String str5 = this.$metadata;
                    luaFunction = this.$callback;
                    Map<String, Object> mapFetchVPNInfo = ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).fetchVPNInfo(str);
                    Object obj2 = mapFetchVPNInfo.get("id");
                    String str6 = obj2 instanceof String ? (String) obj2 : null;
                    if (str6 == null) {
                        Object obj3 = mapFetchVPNInfo.get("instId");
                        str6 = obj3 instanceof String ? (String) obj3 : null;
                    }
                    if (Intrinsics.EZpvd((Object) str4, (Object) PlanetPublisherPluginType.SPOT.getValue())) {
                        if (str6 != null) {
                            InterfaceC49513upv interfaceC49513upv = (InterfaceC49513upv) C43251rlk.copydefault(InterfaceC49513upv.class);
                            this.L$0 = str;
                            this.L$1 = luaFunction;
                            this.label = 1;
                            obj = interfaceC49513upv.AEQbTJ(str6, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            luaFunction4 = luaFunction;
                            str2 = (String) obj;
                            if (C33129mqd.OLrzqt((CharSequence) str2)) {
                            }
                            if (luaValueArrInvoke == null) {
                            }
                        }
                        new Function0() { // from class: o.tSY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return MLNPlanetBridge.C17481.invokeSuspend$lambda$5$lambda$1(luaFunction, str);
                            }
                        };
                    } else if (Intrinsics.EZpvd((Object) str4, (Object) PlanetPublisherPluginType.FUTURES.getValue())) {
                        if (str6 != null) {
                            InterfaceC49513upv interfaceC49513upv2 = (InterfaceC49513upv) C43251rlk.copydefault(InterfaceC49513upv.class);
                            this.L$0 = str;
                            this.L$1 = luaFunction;
                            this.label = 2;
                            obj = interfaceC49513upv2.KWHzl(str6, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            luaFunction3 = luaFunction;
                            str3 = (String) obj;
                            if (C33129mqd.OLrzqt((CharSequence) str3)) {
                            }
                            if (luaValueArrInvoke == null) {
                            }
                        }
                        new Function0() { // from class: o.tTb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return MLNPlanetBridge.C17481.invokeSuspend$lambda$5$lambda$3(luaFunction, str);
                            }
                        };
                    } else if (Intrinsics.EZpvd((Object) str4, (Object) PlanetPublisherPluginType.BOTS.getValue()) && str5 != null) {
                        uBU ubu = (uBU) C43251rlk.copydefault(uBU.class);
                        this.L$0 = str;
                        this.L$1 = luaFunction;
                        this.label = 3;
                        obj = ubu.copydefault(str5, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        luaFunction2 = luaFunction;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (luaFunction2 != null) {
                        }
                    }
                }
            } else if (i == 1) {
                luaFunction4 = (LuaFunction) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = (String) obj;
                if (C33129mqd.OLrzqt((CharSequence) str2)) {
                    if (luaFunction4 != null) {
                        luaValueArrInvoke = luaFunction4.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false), LuaString.copydefault(str)});
                    }
                } else if (luaFunction4 != null) {
                    luaValueArrInvoke = luaFunction4.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(true), LuaString.copydefault(C33129mqd.gEmmrt(str2))});
                }
                if (luaValueArrInvoke == null) {
                    luaFunction = luaFunction4;
                    new Function0() { // from class: o.tSY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return MLNPlanetBridge.C17481.invokeSuspend$lambda$5$lambda$1(luaFunction, str);
                        }
                    };
                }
            } else if (i == 2) {
                luaFunction3 = (LuaFunction) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = (String) obj;
                if (C33129mqd.OLrzqt((CharSequence) str3)) {
                    if (luaFunction3 != null) {
                        luaValueArrInvoke = luaFunction3.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false), LuaString.copydefault(str)});
                    }
                } else if (luaFunction3 != null) {
                    luaValueArrInvoke = luaFunction3.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(true), LuaString.copydefault(C33129mqd.gEmmrt(str3))});
                }
                if (luaValueArrInvoke == null) {
                    luaFunction = luaFunction3;
                    new Function0() { // from class: o.tTb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return MLNPlanetBridge.C17481.invokeSuspend$lambda$5$lambda$3(luaFunction, str);
                        }
                    };
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                luaFunction2 = (LuaFunction) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (luaFunction2 != null) {
                    luaFunction2.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(zBooleanValue2), LuaString.copydefault(str)});
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LuaValue[] invokeSuspend$lambda$5$lambda$1(LuaFunction luaFunction, String str) {
            if (luaFunction != null) {
                return luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false), LuaString.copydefault(str)});
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LuaValue[] invokeSuspend$lambda$5$lambda$3(LuaFunction luaFunction, String str) {
            if (luaFunction != null) {
                return luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false), LuaString.copydefault(str)});
            }
            return null;
        }
    }
}
