package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.RecaptchaActionScene;
import com.okinc.captcha.impl.data.remote.RecaptchaSiteKey;
import com.okinc.captcha.impl.recaptcha.RecaptchaService$startCaptcha$1;
import com.okinc.captcha.impl.recaptcha.RecaptchaUserCancelException;
import com.okinc.captcha.impl.recaptcha.RecaptchaVerificationException;
import com.okinc.components.track.bean.EventParamsList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC30369lVv;
import o.C30368lVu;
import o.C6697aUI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lVV {
    public static final TaskDescription Companion = new TaskDescription(null);

    @yCM
    public lVV() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [80=4] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x0194 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x0147 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x01b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x00ed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0096 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x014e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0150 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x0145 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00ba */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.lVY] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [o.lVY] */
    /* JADX WARN: Type inference failed for: r5v14, types: [o.lVY] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [o.mzt] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull FragmentActivity fragmentActivity, boolean z, @NotNull java.lang.String str, RecaptchaActionScene recaptchaActionScene, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, @NotNull Continuation<? super AbstractC30369lVv> continuation) throws java.lang.Throwable {
        RecaptchaService$startCaptcha$1 recaptchaService$startCaptcha$1;
        final ?? c33622mzt;
        ?? r14;
        java.lang.String str2;
        FragmentActivity fragmentActivity2;
        long j;
        lVV lvv;
        FragmentActivity fragmentActivity3;
        long j2;
        java.lang.String key;
        ?? r9;
        java.lang.String str3;
        java.lang.String key2;
        lVG lvg;
        Function1<? super EventParamsList, Unit> function13;
        java.lang.String str4;
        java.lang.String str5;
        long jCurrentTimeMillis;
        long j3;
        ?? r92;
        ?? r142;
        ?? r93;
        ?? r94;
        ?? r95;
        ?? r96;
        ?? r97 = str;
        if (continuation instanceof RecaptchaService$startCaptcha$1) {
            recaptchaService$startCaptcha$1 = (RecaptchaService$startCaptcha$1) continuation;
            int i = recaptchaService$startCaptcha$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptchaService$startCaptcha$1.label = i - Integer.MIN_VALUE;
            } else {
                recaptchaService$startCaptcha$1 = new RecaptchaService$startCaptcha$1(this, continuation);
            }
        }
        RecaptchaService$startCaptcha$1 recaptchaService$startCaptcha$12 = recaptchaService$startCaptcha$1;
        java.lang.Object obj = recaptchaService$startCaptcha$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = recaptchaService$startCaptcha$12.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = recaptchaService$startCaptcha$12.J$1;
                j3 = recaptchaService$startCaptcha$12.J$0;
                str4 = (java.lang.String) recaptchaService$startCaptcha$12.L$6;
                str5 = (java.lang.String) recaptchaService$startCaptcha$12.L$5;
                r9 = (C33622mzt) recaptchaService$startCaptcha$12.L$4;
                function13 = (Function1) recaptchaService$startCaptcha$12.L$3;
                java.lang.String str6 = (java.lang.String) recaptchaService$startCaptcha$12.L$2;
                fragmentActivity3 = (FragmentActivity) recaptchaService$startCaptcha$12.L$1;
                lvv = (lVV) recaptchaService$startCaptcha$12.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    str2 = "CaptchaService";
                    r14 = r9;
                    r94 = str6;
                } catch (RecaptchaUserCancelException unused) {
                    str2 = "CaptchaService";
                    r96 = r9;
                    pUU.copydefault(str2, "[RecaptchaService] user cancels captcha");
                    AbstractC30369lVv.TaskDescription taskDescription = new AbstractC30369lVv.TaskDescription(null, true);
                    r96.copydefault();
                    return taskDescription;
                } catch (RecaptchaVerificationException unused2) {
                    str2 = "CaptchaService";
                    r14 = r9;
                    r94 = str6;
                    j2 = jCurrentTimeMillis;
                    r93 = r94;
                    r142 = r14;
                    c33622mzt = r142;
                    r92 = r93;
                    pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
                    lVY.EZpvd.AEQbTJ(r92, j2);
                    AbstractC30369lVv.TaskDescription taskDescription2 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
                    c33622mzt.copydefault();
                    return taskDescription2;
                } catch (CancellationException e) {
                    e = e;
                    str2 = "CaptchaService";
                    pUU.copydefault(str2, "[RecaptchaService] coroutine CancellationException");
                    throw e;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str2 = "CaptchaService";
                    r95 = r9;
                    pUU.copydefault(str2, "[RecaptchaService] general exception: message: " + e.getMessage());
                    AbstractC30369lVv.TaskDescription taskDescription3 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                    r95.copydefault();
                    return taskDescription3;
                }
                try {
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j3;
                    pUU.KWHzl(str2, "[RecaptchaService] captcha verification success");
                    lVY.EZpvd.EZpvd(r94, jCurrentTimeMillis, function13);
                    AbstractC30369lVv.Activity activity = new AbstractC30369lVv.Activity((java.util.Map) obj, str4, str5);
                    r14.copydefault();
                    return activity;
                } catch (RecaptchaVerificationException unused3) {
                    j2 = jCurrentTimeMillis;
                    r93 = r94;
                    r142 = r14;
                    c33622mzt = r142;
                    r92 = r93;
                    pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
                    lVY.EZpvd.AEQbTJ(r92, j2);
                    AbstractC30369lVv.TaskDescription taskDescription22 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
                    c33622mzt.copydefault();
                    return taskDescription22;
                } catch (java.lang.Throwable th) {
                    th = th;
                    r97 = r14;
                    c33622mzt = r97;
                    c33622mzt.copydefault();
                    throw th;
                }
            }
            C56391yDq.AEQbTJ(obj);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            c33622mzt = new C33622mzt();
            try {
                c33622mzt.OLrzqt(fragmentActivity, (50 & 2) != 0, (50 & 4) != 0, (50 & 8) == 0 ? false : true, (50 & 16) != 0 ? 500L : 0L, (50 & 32) != 0 ? fragmentActivity.getResources().getString(C6697aUI.Activity.OLrzqt) : null);
                if (z) {
                    try {
                        try {
                            key = RecaptchaSiteKey.CHECKBOX.getKey();
                        } catch (RecaptchaUserCancelException unused4) {
                            r9 = c33622mzt;
                            str2 = "CaptchaService";
                            r96 = r9;
                            pUU.copydefault(str2, "[RecaptchaService] user cancels captcha");
                            AbstractC30369lVv.TaskDescription taskDescription4 = new AbstractC30369lVv.TaskDescription(null, true);
                            r96.copydefault();
                            return taskDescription4;
                        } catch (RecaptchaVerificationException unused5) {
                            fragmentActivity3 = fragmentActivity;
                            lvv = this;
                            str2 = "CaptchaService";
                            j2 = 0;
                            c33622mzt = c33622mzt;
                            r92 = r97;
                            pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
                            lVY.EZpvd.AEQbTJ(r92, j2);
                            AbstractC30369lVv.TaskDescription taskDescription222 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
                            c33622mzt.copydefault();
                            return taskDescription222;
                        } catch (CancellationException e3) {
                            e = e3;
                            str2 = "CaptchaService";
                            pUU.copydefault(str2, "[RecaptchaService] coroutine CancellationException");
                            throw e;
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            r9 = c33622mzt;
                            str2 = "CaptchaService";
                            r95 = r9;
                            pUU.copydefault(str2, "[RecaptchaService] general exception: message: " + e.getMessage());
                            AbstractC30369lVv.TaskDescription taskDescription32 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                            r95.copydefault();
                            return taskDescription32;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c33622mzt.copydefault();
                        throw th;
                    }
                } else {
                    key = RecaptchaSiteKey.SCORE.getKey();
                }
                str3 = key;
                key2 = (recaptchaActionScene == null ? RecaptchaActionScene.LOGIN : recaptchaActionScene).getKey();
                lVY.EZpvd.OLrzqt(r97, z, function1);
                r14 = c33622mzt;
                str2 = "CaptchaService";
            } catch (RecaptchaUserCancelException unused6) {
                r14 = c33622mzt;
                str2 = "CaptchaService";
                r96 = r14;
                pUU.copydefault(str2, "[RecaptchaService] user cancels captcha");
                AbstractC30369lVv.TaskDescription taskDescription42 = new AbstractC30369lVv.TaskDescription(null, true);
                r96.copydefault();
                return taskDescription42;
            } catch (RecaptchaVerificationException unused7) {
                fragmentActivity2 = fragmentActivity;
                r14 = c33622mzt;
                str2 = "CaptchaService";
            } catch (CancellationException e5) {
                e = e5;
                r14 = c33622mzt;
                str2 = "CaptchaService";
                pUU.copydefault(str2, "[RecaptchaService] coroutine CancellationException");
                throw e;
            } catch (java.lang.Exception e6) {
                e = e6;
                r14 = c33622mzt;
                str2 = "CaptchaService";
                r95 = r14;
                pUU.copydefault(str2, "[RecaptchaService] general exception: message: " + e.getMessage());
                AbstractC30369lVv.TaskDescription taskDescription322 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                r95.copydefault();
                return taskDescription322;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            try {
                try {
                    try {
                        lvg = new lVG(fragmentActivity, key2, z, str3, C33492mxV.OLrzqt(), new Function0() { // from class: o.lVW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return lVV.AEQbTJ(c33622mzt);
                            }
                        });
                        recaptchaService$startCaptcha$12.L$0 = this;
                        fragmentActivity2 = fragmentActivity;
                        try {
                            recaptchaService$startCaptcha$12.L$1 = fragmentActivity2;
                            recaptchaService$startCaptcha$12.L$2 = r97;
                            recaptchaService$startCaptcha$12.L$3 = function12;
                            recaptchaService$startCaptcha$12.L$4 = r14;
                            recaptchaService$startCaptcha$12.L$5 = str3;
                            recaptchaService$startCaptcha$12.L$6 = key2;
                            recaptchaService$startCaptcha$12.J$0 = jCurrentTimeMillis2;
                            j = 0;
                        } catch (RecaptchaVerificationException unused8) {
                            j = 0;
                            lvv = this;
                            fragmentActivity3 = fragmentActivity2;
                            j2 = j;
                            r93 = r97;
                            r142 = r14;
                            c33622mzt = r142;
                            r92 = r93;
                            pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
                            lVY.EZpvd.AEQbTJ(r92, j2);
                            AbstractC30369lVv.TaskDescription taskDescription2222 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
                            c33622mzt.copydefault();
                            return taskDescription2222;
                        }
                    } catch (RecaptchaUserCancelException unused9) {
                        r96 = r14;
                        pUU.copydefault(str2, "[RecaptchaService] user cancels captcha");
                        AbstractC30369lVv.TaskDescription taskDescription422 = new AbstractC30369lVv.TaskDescription(null, true);
                        r96.copydefault();
                        return taskDescription422;
                    } catch (CancellationException e7) {
                        e = e7;
                        pUU.copydefault(str2, "[RecaptchaService] coroutine CancellationException");
                        throw e;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        r95 = r14;
                        pUU.copydefault(str2, "[RecaptchaService] general exception: message: " + e.getMessage());
                        AbstractC30369lVv.TaskDescription taskDescription3222 = new AbstractC30369lVv.TaskDescription(e.getMessage(), false, 2, null);
                        r95.copydefault();
                        return taskDescription3222;
                    }
                } catch (RecaptchaVerificationException unused10) {
                    fragmentActivity2 = fragmentActivity;
                }
                try {
                    recaptchaService$startCaptcha$12.J$1 = 0L;
                    recaptchaService$startCaptcha$12.label = 1;
                    java.lang.Object objAEQbTJ = lvg.AEQbTJ(recaptchaService$startCaptcha$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    lvv = this;
                    function13 = function12;
                    obj = objAEQbTJ;
                    str4 = key2;
                    fragmentActivity3 = fragmentActivity2;
                    str5 = str3;
                    jCurrentTimeMillis = 0;
                    j3 = jCurrentTimeMillis2;
                    r94 = r97;
                    r14 = r14;
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j3;
                    pUU.KWHzl(str2, "[RecaptchaService] captcha verification success");
                    lVY.EZpvd.EZpvd(r94, jCurrentTimeMillis, function13);
                    AbstractC30369lVv.Activity activity2 = new AbstractC30369lVv.Activity((java.util.Map) obj, str4, str5);
                    r14.copydefault();
                    return activity2;
                } catch (RecaptchaVerificationException unused11) {
                    lvv = this;
                    fragmentActivity3 = fragmentActivity2;
                    j2 = j;
                    r93 = r97;
                    r142 = r14;
                    c33622mzt = r142;
                    r92 = r93;
                    pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
                    lVY.EZpvd.AEQbTJ(r92, j2);
                    AbstractC30369lVv.TaskDescription taskDescription22222 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
                    c33622mzt.copydefault();
                    return taskDescription22222;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                c33622mzt = r14;
                c33622mzt.copydefault();
                throw th;
            }
            pUU.copydefault(str2, "[RecaptchaService] captcha verification client exception");
            lVY.EZpvd.AEQbTJ(r92, j2);
            AbstractC30369lVv.TaskDescription taskDescription222222 = new AbstractC30369lVv.TaskDescription(lvv.copydefault(fragmentActivity3, ""), false, 2, null);
            c33622mzt.copydefault();
            return taskDescription222222;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    public static final Unit AEQbTJ(C33622mzt c33622mzt) {
        c33622mzt.copydefault();
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(android.app.Activity activity, java.lang.String str) {
        return C33069mpW.KWHzl(activity, C30368lVu.ActionBar.copydefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("code", str)));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lVV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
