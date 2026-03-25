package com.immomo.mls.fun.ui.custom;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieTask;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.just.agentweb.DefaultWebClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import o.C54819xWm;
import o.C55113xdn;
import o.C7352aiH;
import o.C7546alq;
import o.C7823arB;
import o.C7827arF;
import o.C7870arw;
import o.C7911ask;
import o.InterfaceC54816xWj;
import o.InterfaceC60044zuT;
import o.pUU;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKLottieAnimationView extends UDViewGroup<C7546alq> {
    public int AYXKKw;
    public boolean AhwBna;
    public ImageView.ScaleType AkhnZx;
    public int AuCTel;
    public long DbNXlk;
    public LuaFunction OLrzqt;
    public float copydefault;
    public LuaFunction djBIcL;
    public boolean ejfBZ;
    public LottieListener<LottieComposition> fARcdN;
    public C55113xdn fIwbmz;
    public final InterfaceC54816xWj fJNWhG;
    public float fetchVPNInfo;
    public LuaFunction gEmmrt;
    public boolean getFieldNames;
    public LottieTask<LottieComposition> getNewProxyInstance;
    public LuaFunction hDKMBd;
    public LuaFunction isConnected;
    public boolean iwGUEr;
    public boolean uzCIH;
    public LuaFunction valueOf;
    public int values;
    public LuaFunction wlaJM;
    public C7352aiH zLjUOn;
    public static final String[] KWHzl = {"setCompletionBlock", "fileName", "cdn", "contentMode", "viewportFrame", "animationSpeed", "currentTime", "currentFrame", "currentProgress", "loopMode", "backgroundBehavior", "shouldRasterizeWhenIdle", "respectAnimationFrameRate", "play", "playWithCompletion", "playWithFrame", "playWithProgress", "stop", "pause", "filePath", "darkModelFileName", "darkModelFilePath", "isAnimationQueued", "isAnimationPlaying", "intrinsicContentSize", "realtimeAnimationFrame", "realtimeAnimationProgress", "setPlayingStateBlock", "removePlayingStateBlock", "setAppDidBecomeActiveBlock", "setAppEnterBackgroundBlock", "autoMirrored", "absoluteLocalFilePath", "setMaxProgress", "resume", "setCancelCallback", "addAnimatorListenerWhenAttach", "setAnimationLoadedBlock", "setViewAttachedListener"};
    public static String AEQbTJ = "";
    public static String EZpvd = "";

    @InterfaceC60044zuT
    public LuaValue[] currentTime(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] intrinsicContentSize(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] isAnimationQueued(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] respectAnimationFrameRate(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] shouldRasterizeWhenIdle(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] viewportFrame(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public OKLottieAnimationView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.fJNWhG = new InterfaceC54816xWj() { // from class: com.immomo.mls.fun.ui.custom.OKLottieAnimationView.3
            @Override // o.InterfaceC54816xWj
            public void copydefault() {
                if (OKLottieAnimationView.this.valueOf != null) {
                    OKLottieAnimationView.this.valueOf.OLrzqt();
                }
            }

            @Override // o.InterfaceC54816xWj
            public void KWHzl() {
                if (OKLottieAnimationView.this.gEmmrt != null) {
                    OKLottieAnimationView.this.gEmmrt.OLrzqt();
                }
            }
        };
        this.AkhnZx = ImageView.ScaleType.CENTER;
        this.zLjUOn = new C7352aiH();
        this.copydefault = 1.0f;
        this.DbNXlk = 0L;
        this.values = 0;
        this.fetchVPNInfo = 0.0f;
        this.AuCTel = 1;
        this.AYXKKw = -1;
        this.getFieldNames = false;
        this.iwGUEr = false;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCompletionBlock(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.isConnected = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAnimationLoadedBlock(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.OLrzqt = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C7546alq AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        String str;
        InputStream inputStream;
        String strEZpvd;
        LuaValue luaValue;
        C7546alq c7546alq = new C7546alq(AubY(), this);
        c7546alq.setViewLifeCycleCallback(this);
        C55113xdn c55113xdn = new C55113xdn(AubY());
        this.fIwbmz = c55113xdn;
        c55113xdn.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: o.alL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                this.EZpvd.copydefault(lottieComposition);
            }
        });
        this.fIwbmz.setFailureListener(new LottieListener() { // from class: o.alN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                this.KWHzl.OLrzqt((java.lang.Throwable) obj);
            }
        });
        this.fIwbmz.loop(false);
        if (this.fIwbmz != null) {
            OLrzqt();
            this.fIwbmz.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.immomo.mls.fun.ui.custom.OKLottieAnimationView.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (OKLottieAnimationView.this.hDKMBd != null) {
                        OKLottieAnimationView.this.hDKMBd.AEQbTJ(LuaTable.AEQbTJ(OKLottieAnimationView.this.globals));
                    }
                }
            });
        }
        c7546alq.addView(this.fIwbmz, new ViewGroup.LayoutParams(-1, -2));
        String str2 = null;
        InputStream inputStream2 = null;
        if (luaValueArr.length <= 0 || luaValueArr[0] == null) {
            str = "loading_logo";
            AEQbTJ = "loading_logo";
            EZpvd = "loading_logo_night";
            inputStream = null;
        } else {
            if (luaValueArr.length > 1 && (luaValue = luaValueArr[1]) != null) {
                this.AhwBna = luaValue.toBoolean();
            }
            String javaString = luaValueArr[0].toJavaString();
            if (TextUtils.isEmpty(javaString)) {
                return c7546alq;
            }
            if (javaString.startsWith(DefaultWebClient.HTTP_SCHEME) || javaString.startsWith(DefaultWebClient.HTTPS_SCHEME)) {
                strEZpvd = C7827arF.EZpvd(luaValueArr[0].toJavaString());
                str = null;
            } else {
                Pair<String, InputStream> pairCopydefault = copydefault(javaString);
                str = pairCopydefault.first;
                inputStream2 = pairCopydefault.second;
                strEZpvd = null;
            }
            InputStream inputStream3 = inputStream2;
            str2 = strEZpvd;
            inputStream = inputStream3;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.fIwbmz.setAnimationFromUrl(str2);
        } else if (inputStream != null) {
            copydefault(str, inputStream, str);
        } else {
            this.fIwbmz.setAnimation("luaEmptyLottieTask");
        }
        return c7546alq;
    }

    public final /* synthetic */ void copydefault(LottieComposition lottieComposition) {
        KWHzl(true, (String) null);
    }

    public final /* synthetic */ void OLrzqt(Throwable th) {
        if ((th instanceof FileNotFoundException) && "luaClearCompositionTask".equals(th.getMessage())) {
            return;
        }
        KWHzl(false, th.getMessage());
    }

    public final void KWHzl(boolean z, @Nullable String str) {
        if (!z) {
            C7870arw.EZpvd("animationLoaded error=" + str);
        }
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.KWHzl(z);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
        C54819xWm.KWHzl().AEQbTJ(this.fJNWhG);
        if (this.AhwBna) {
            this.AhwBna = false;
            this.fIwbmz.playAnimation();
        }
        if (this.uzCIH) {
            OLrzqt();
        }
        LuaFunction luaFunction = this.wlaJM;
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setViewAttachedListener(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.wlaJM = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        super.AEQbTJ();
        C54819xWm.KWHzl().KWHzl(this.fJNWhG);
        this.AhwBna = false;
        EZpvd = "";
        AEQbTJ = "";
        C55113xdn c55113xdn = this.fIwbmz;
        if (c55113xdn != null) {
            c55113xdn.cancelAnimation();
            this.fIwbmz.removeAllAnimatorListeners();
            this.ejfBZ = false;
        }
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        super.destroy();
        AYXKKw();
    }

    public final void OLrzqt() {
        C55113xdn c55113xdn = this.fIwbmz;
        if (c55113xdn == null || this.ejfBZ) {
            return;
        }
        this.ejfBZ = true;
        c55113xdn.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.immomo.mls.fun.ui.custom.OKLottieAnimationView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (OKLottieAnimationView.this.isConnected != null) {
                    OKLottieAnimationView.this.isConnected.KWHzl(true);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (OKLottieAnimationView.this.djBIcL != null) {
                    OKLottieAnimationView.this.djBIcL.OLrzqt();
                }
            }
        });
    }

    @InterfaceC60044zuT
    public LuaValue[] fileName(LuaValue[] luaValueArr) {
        C55113xdn c55113xdn;
        if (luaValueArr != null && luaValueArr.length > 0 && luaValueArr[0].isString()) {
            Pair<String, InputStream> pairCopydefault = copydefault(luaValueArr[0].toJavaString());
            String str = pairCopydefault.first;
            InputStream inputStream = pairCopydefault.second;
            if (inputStream == null || (c55113xdn = this.fIwbmz) == null) {
                return null;
            }
            if (c55113xdn.isAnimating()) {
                this.fIwbmz.cancelAnimation();
            }
            copydefault(str, inputStream, str);
            return null;
        }
        return LuaValue.varargsOf(LuaString.copydefault(AEQbTJ));
    }

    @InterfaceC60044zuT
    public LuaValue[] cdn(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return null;
        }
        this.fIwbmz.setAnimationFromUrl(C7827arF.EZpvd(C7827arF.EZpvd(luaValueArr[0].toJavaString(), AubY(), luaValueArr[1].toBoolean())));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:16:0x002f, B:18:0x003c, B:19:0x0042), top: B:24:0x002f }] */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] absoluteLocalFilePath(LuaValue[] luaValueArr) {
        String javaString;
        if (luaValueArr != null && luaValueArr.length > 0 && luaValueArr[0].isString()) {
            String javaString2 = luaValueArr[0].toJavaString();
            if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
                javaString = luaValueArr[1].toJavaString();
                if (TextUtils.isEmpty(javaString)) {
                }
                InputStream fileInputStream = new FileInputStream(javaString2);
                if (javaString2.endsWith(".lottie")) {
                }
                copydefault(javaString2, fileInputStream, javaString);
            } else {
                javaString = null;
                try {
                    InputStream fileInputStream2 = new FileInputStream(javaString2);
                    if (javaString2.endsWith(".lottie")) {
                        fileInputStream2 = new ZipInputStream(fileInputStream2);
                    }
                    copydefault(javaString2, fileInputStream2, javaString);
                } catch (Exception e) {
                    pUU.copydefault("OKLottieAnimationView", "absoluteLocalFilePath error=" + e.getMessage());
                }
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] contentMode(LuaValue[] luaValueArr) {
        int i;
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            switch (AnonymousClass1.copydefault[this.fIwbmz.getScaleType().ordinal()]) {
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                default:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
            }
            return LuaValue.varargsOf(LuaNumber.valueOf(i));
        }
        switch (luaValueArr[0].toInt()) {
            case 0:
                this.AkhnZx = ImageView.ScaleType.MATRIX;
                break;
            case 1:
                this.AkhnZx = ImageView.ScaleType.FIT_XY;
                break;
            case 2:
                this.AkhnZx = ImageView.ScaleType.FIT_START;
                break;
            case 3:
                this.AkhnZx = ImageView.ScaleType.FIT_CENTER;
                break;
            case 4:
                this.AkhnZx = ImageView.ScaleType.FIT_END;
                break;
            case 5:
                this.AkhnZx = ImageView.ScaleType.CENTER;
                break;
            case 6:
                this.AkhnZx = ImageView.ScaleType.CENTER_CROP;
                break;
            case 7:
                this.AkhnZx = ImageView.ScaleType.CENTER_INSIDE;
                break;
        }
        this.fIwbmz.setScaleType(this.AkhnZx);
        return null;
    }

    /* JADX INFO: renamed from: com.immomo.mls.fun.ui.custom.OKLottieAnimationView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            copydefault = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[ImageView.ScaleType.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[ImageView.ScaleType.CENTER_CROP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] animationSpeed(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.fIwbmz.getSpeed()));
        }
        float f = luaValueArr[0].toFloat();
        this.copydefault = f;
        this.fIwbmz.setSpeed(f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] currentFrame(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.fIwbmz.getFrame()));
        }
        int i = luaValueArr[0].toInt();
        this.values = i;
        this.fIwbmz.setMinFrame(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] currentProgress(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.fIwbmz.getProgress()));
        }
        float f = luaValueArr[0].toFloat();
        this.fetchVPNInfo = f;
        this.fIwbmz.setProgress(f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaxProgress(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return null;
        }
        this.fIwbmz.setMaxProgress(luaValueArr[0].toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] loopMode(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.fIwbmz.getRepeatMode()));
        }
        int i = luaValueArr[0].toInt();
        this.AuCTel = i;
        if (i == 2) {
            this.fIwbmz.setRepeatCount(-1);
            this.fIwbmz.setRepeatMode(2);
            return null;
        }
        if (i == 1) {
            this.fIwbmz.setRepeatCount(-1);
            this.fIwbmz.setRepeatMode(1);
            return null;
        }
        this.fIwbmz.setRepeatCount(0);
        this.fIwbmz.setRepeatMode(1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] backgroundBehavior(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.valueOf(this.AYXKKw));
        }
        this.AYXKKw = luaValueArr[0].toInt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] play(LuaValue[] luaValueArr) {
        this.fIwbmz.playAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] playWithCompletion(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.isConnected = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        this.fIwbmz.playAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] playWithFrame(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            int length = luaValueArr.length;
            if (length == 1) {
                if (luaValueArr[0].isNumber()) {
                    this.fIwbmz.setFrame(luaValueArr[0].toInt());
                }
                if (luaValueArr[0].isFunction()) {
                    this.isConnected = luaValueArr[0].toLuaFunction();
                }
            } else if (length == 2) {
                if (luaValueArr[0].isNumber() && luaValueArr[1].isNumber()) {
                    this.fIwbmz.setMinAndMaxFrame(luaValueArr[0].toInt(), luaValueArr[1].toInt());
                }
                if (luaValueArr[0].isNumber() && luaValueArr[1].isFunction()) {
                    this.fIwbmz.setFrame(luaValueArr[0].toInt());
                    this.isConnected = luaValueArr[1].toLuaFunction();
                }
            } else if (length == 3 && luaValueArr[0].isNumber() && luaValueArr[1].isNumber() && luaValueArr[2].isFunction()) {
                this.fIwbmz.setMinAndMaxFrame(luaValueArr[0].toInt(), luaValueArr[1].toInt());
                this.isConnected = luaValueArr[2].toLuaFunction();
            }
        }
        this.fIwbmz.playAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] playWithProgress(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            int length = luaValueArr.length;
            if (length == 1) {
                if (luaValueArr[0].isNumber()) {
                    this.fIwbmz.setProgress(luaValueArr[0].toFloat());
                }
                if (luaValueArr[0].isFunction()) {
                    this.isConnected = luaValueArr[0].toLuaFunction();
                }
            } else if (length == 2) {
                if (luaValueArr[0].isNumber() && luaValueArr[1].isNumber()) {
                    this.fIwbmz.setMinAndMaxProgress(luaValueArr[0].toFloat(), luaValueArr[1].toFloat());
                }
                if (luaValueArr[0].isNumber() && luaValueArr[1].isFunction()) {
                    this.fIwbmz.setProgress(luaValueArr[0].toFloat());
                    this.isConnected = luaValueArr[1].toLuaFunction();
                }
            } else if (length == 3 && luaValueArr[0].isNumber() && luaValueArr[1].isNumber() && luaValueArr[2].isFunction()) {
                this.fIwbmz.setMinAndMaxProgress(luaValueArr[0].toFloat(), luaValueArr[1].toFloat());
                this.isConnected = luaValueArr[2].toLuaFunction();
            }
        }
        this.fIwbmz.playAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        C55113xdn c55113xdn = this.fIwbmz;
        if (c55113xdn == null) {
            return null;
        }
        c55113xdn.cancelAnimation();
        this.fIwbmz.removeAllAnimatorListeners();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] pause(LuaValue[] luaValueArr) {
        C55113xdn c55113xdn = this.fIwbmz;
        if (c55113xdn == null) {
            return null;
        }
        c55113xdn.pauseAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] resume(LuaValue[] luaValueArr) {
        C55113xdn c55113xdn = this.fIwbmz;
        if (c55113xdn == null) {
            return null;
        }
        c55113xdn.resumeAnimation();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] filePath(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(C7823arB.AEQbTJ(AEQbTJ + ".json", AubY())));
    }

    @InterfaceC60044zuT
    public LuaValue[] darkModelFileName(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(EZpvd));
    }

    @InterfaceC60044zuT
    public LuaValue[] darkModelFilePath(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(C7823arB.AEQbTJ(EZpvd + ".json", AubY())));
    }

    @InterfaceC60044zuT
    public LuaValue[] isAnimationPlaying(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.fIwbmz.isAnimating()));
    }

    @InterfaceC60044zuT
    public LuaValue[] realtimeAnimationFrame(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(this.fIwbmz.getFrame()));
    }

    @InterfaceC60044zuT
    public LuaValue[] realtimeAnimationProgress(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(this.fIwbmz.getProgress()));
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayingStateBlock(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.hDKMBd = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] removePlayingStateBlock(LuaValue[] luaValueArr) {
        this.fIwbmz.removeAllAnimatorListeners();
        this.fIwbmz.removeAllUpdateListeners();
        this.hDKMBd = null;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAppDidBecomeActiveBlock(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.valueOf = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAppEnterBackgroundBlock(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.gEmmrt = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] autoMirrored(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        this.fIwbmz.setAutoMirrored(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCancelCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.djBIcL = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addAnimatorListenerWhenAttach(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0 && luaValueArr[0].isBoolean()) {
            this.uzCIH = luaValueArr[0].toBoolean();
            return null;
        }
        return LuaValue.rBoolean(this.uzCIH);
    }

    public final Pair<String, InputStream> copydefault(String str) {
        AEQbTJ = str;
        EZpvd = AEQbTJ + (str.endsWith("_night") ? "" : "_night");
        Pair<String, InputStream> pairEZpvd = C7911ask.OLrzqt(this.globals) ? EZpvd(str, true) : null;
        return (pairEZpvd == null || pairEZpvd.second == null) ? EZpvd(str, false) : pairEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, InputStream> EZpvd(String str, boolean z) {
        String str2;
        if (z) {
            str2 = str.endsWith("_night") ? "" : "_night";
        }
        String str3 = str + str2 + ".lottie";
        InputStream inputStreamOLrzqt = C7823arB.OLrzqt(str3, zuBGHE());
        InputStream zipInputStream = inputStreamOLrzqt != null ? new ZipInputStream(inputStreamOLrzqt) : null;
        if (zipInputStream == null) {
            str3 = str + str2 + ".json";
            zipInputStream = C7823arB.OLrzqt(str3, zuBGHE());
        }
        return new Pair<>(str3, zipInputStream);
    }

    public final void copydefault(final String str, InputStream inputStream, final String str2) {
        pUU.EZpvd("OKLottieAnimationView", "loadLottieTask fileName=" + str + " cacheKey=" + str2);
        if (str.endsWith(".json")) {
            this.fIwbmz.setAnimation(inputStream, str2);
            return;
        }
        if (str.endsWith(".lottie") && (inputStream instanceof ZipInputStream)) {
            this.fIwbmz.setAnimation("luaClearCompositionTask");
            AYXKKw();
            this.getNewProxyInstance = LottieCompositionFactory.fromZipStream((ZipInputStream) inputStream, str2);
            LottieListener<LottieComposition> lottieListener = new LottieListener() { // from class: o.alM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    this.EZpvd.KWHzl(str, str2, (LottieComposition) obj);
                }
            };
            this.fARcdN = lottieListener;
            this.getNewProxyInstance.addListener(lottieListener);
        }
    }

    public final /* synthetic */ void KWHzl(String str, String str2, LottieComposition lottieComposition) {
        pUU.EZpvd("OKLottieAnimationView", "Task result fileName=" + str + " cacheKey=" + str2 + " autoPlay=" + this.AhwBna);
        this.fIwbmz.setComposition(lottieComposition);
        if (this.AhwBna) {
            this.AhwBna = false;
            this.fIwbmz.playAnimation();
        }
    }

    public final void AYXKKw() {
        LottieListener<LottieComposition> lottieListener;
        pUU.EZpvd("OKLottieAnimationView", "release lottie task");
        LottieTask<LottieComposition> lottieTask = this.getNewProxyInstance;
        if (lottieTask != null && (lottieListener = this.fARcdN) != null) {
            lottieTask.removeListener(lottieListener);
        }
        this.getNewProxyInstance = null;
        this.fARcdN = null;
    }
}
