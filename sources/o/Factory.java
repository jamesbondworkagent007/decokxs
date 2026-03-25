package o;

import aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProviderKt$readTokenFromCache$1;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AbstractC5110Fc;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Factory {
    public static final java.lang.String OLrzqt(@NotNull HL hl, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return yDV.joinToString$default(strArr, hl.KWHzl(), (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 62, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull HL hl, @NotNull Continuation<? super PersistableBundle> continuation) throws java.lang.Throwable {
        SsoTokenProviderKt$readTokenFromCache$1 ssoTokenProviderKt$readTokenFromCache$1;
        if (continuation instanceof SsoTokenProviderKt$readTokenFromCache$1) {
            ssoTokenProviderKt$readTokenFromCache$1 = (SsoTokenProviderKt$readTokenFromCache$1) continuation;
            int i = ssoTokenProviderKt$readTokenFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoTokenProviderKt$readTokenFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoTokenProviderKt$readTokenFromCache$1 = new SsoTokenProviderKt$readTokenFromCache$1(continuation);
            }
        }
        java.lang.Object objKWHzl = ssoTokenProviderKt$readTokenFromCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoTokenProviderKt$readTokenFromCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.String strOLrzqt = OLrzqt(hl, ObjectInput.AEQbTJ(OLrzqt(hl, "~", ".aws", "sso", "cache"), hl), KWHzl(str));
            ssoTokenProviderKt$readTokenFromCache$1.label = 1;
            objKWHzl = hl.KWHzl(strOLrzqt, ssoTokenProviderKt$readTokenFromCache$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        byte[] bArr = (byte[]) objKWHzl;
        if (bArr == null) {
            throw new ProviderConfigurationException("Invalid or missing SSO session cache. Run `aws sso login` to initiate a new SSO session", null, 2, null);
        }
        return AEQbTJ(bArr);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C5165Hf.AEQbTJ(C60024zu.EZpvd(C59449zhJ.getNewProxyInstance(str))) + ".json";
    }

    public static final PersistableBundle KWHzl(OnCapturedPointerListener onCapturedPointerListener, PersistableBundle persistableBundle, InterfaceC5168Hi interfaceC5168Hi) {
        java.lang.String strKWHzl = onCapturedPointerListener.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalStateException("missing accessToken from CreateTokenResponse".toString());
        }
        C5173Hn c5173HnEZpvd = interfaceC5168Hi.EZpvd();
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        return persistableBundle.copydefault((248 & 1) != 0 ? persistableBundle.AhwBna : strKWHzl, (248 & 2) != 0 ? persistableBundle.KWHzl : c5173HnEZpvd.copydefault(C59519zia.EZpvd(onCapturedPointerListener.EZpvd(), DurationUnit.SECONDS)), (248 & 4) != 0 ? persistableBundle.AEQbTJ : onCapturedPointerListener.OLrzqt(), (248 & 8) != 0 ? persistableBundle.EZpvd : null, (248 & 16) != 0 ? persistableBundle.copydefault : null, (248 & 32) != 0 ? persistableBundle.valueOf : null, (248 & 64) != 0 ? persistableBundle.AYXKKw : null, (248 & 128) != 0 ? persistableBundle.djBIcL : null);
    }

    public static final boolean OLrzqt(PersistableBundle persistableBundle) {
        return (persistableBundle.EZpvd() == null || persistableBundle.KWHzl() == null || persistableBundle.copydefault() == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [200=8] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PersistableBundle AEQbTJ(@NotNull byte[] bArr) {
        C5173Hn c5173HnCopydefault;
        Intrinsics.checkNotNullParameter(bArr, "");
        EU euOLrzqt = EV.OLrzqt(bArr);
        try {
            AbstractC5110Fc abstractC5110FcAEQbTJ = euOLrzqt.AEQbTJ();
            if (abstractC5110FcAEQbTJ.getClass() != AbstractC5110Fc.ActionBar.class) {
                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.ActionBar.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
            }
            java.lang.String strCopydefault = null;
            java.lang.String strCopydefault2 = null;
            java.lang.String strCopydefault3 = null;
            java.lang.String strCopydefault4 = null;
            java.lang.String strCopydefault5 = null;
            C5173Hn c5173HnCopydefault2 = null;
            java.lang.String strCopydefault6 = null;
            java.lang.String strCopydefault7 = null;
            while (true) {
                AbstractC5110Fc abstractC5110FcAEQbTJ2 = euOLrzqt.AEQbTJ();
                if (abstractC5110FcAEQbTJ2 instanceof AbstractC5110Fc.PendingIntent) {
                    if (strCopydefault2 == null) {
                        throw new InvalidSsoTokenException("missing `accessToken`", null, 2, null);
                    }
                    if (strCopydefault == null || (c5173HnCopydefault = C5173Hn.AEQbTJ.copydefault(strCopydefault)) == null) {
                        throw new InvalidSsoTokenException("missing `expiresAt`", null, 2, null);
                    }
                    return new PersistableBundle(strCopydefault2, c5173HnCopydefault, strCopydefault3, strCopydefault4, strCopydefault5, c5173HnCopydefault2, strCopydefault6, strCopydefault7);
                }
                if (!(abstractC5110FcAEQbTJ2 instanceof AbstractC5110Fc.LoaderManager)) {
                    throw new java.lang.IllegalStateException("expected either key or end of object".toString());
                }
                java.lang.String strAEQbTJ = ((AbstractC5110Fc.LoaderManager) abstractC5110FcAEQbTJ2).AEQbTJ();
                switch (strAEQbTJ.hashCode()) {
                    case -1446909349:
                        if (!strAEQbTJ.equals("clientSecret")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ3 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ3.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ3.getClass()));
                            }
                            strCopydefault5 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ3).copydefault();
                        }
                        break;
                    case -1311790642:
                        if (!strAEQbTJ.equals("registrationExpiresAt")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ4 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ4.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ4.getClass()));
                            }
                            c5173HnCopydefault2 = C5173Hn.AEQbTJ.copydefault(((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ4).copydefault());
                        }
                        break;
                    case -1042689291:
                        if (!strAEQbTJ.equals("accessToken")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ5 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ5.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ5.getClass()));
                            }
                            strCopydefault2 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ5).copydefault();
                        }
                        break;
                    case -934795532:
                        if (!strAEQbTJ.equals("region")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ6 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ6.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ6.getClass()));
                            }
                            strCopydefault6 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ6).copydefault();
                        }
                        break;
                    case -56506402:
                        if (!strAEQbTJ.equals("refreshToken")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ7 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ7.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ7.getClass()));
                            }
                            strCopydefault3 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ7).copydefault();
                        }
                        break;
                    case 250196615:
                        if (!strAEQbTJ.equals("expiresAt")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ8 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ8.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ8.getClass()));
                            }
                            strCopydefault = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ8).copydefault();
                        }
                        break;
                    case 908408390:
                        if (!strAEQbTJ.equals(CoreNetworkModuleKt.KEY_CLIENT_ID)) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ9 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ9.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ9.getClass()));
                            }
                            strCopydefault4 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ9).copydefault();
                        }
                        break;
                    case 1316787629:
                        if (!strAEQbTJ.equals("startUrl")) {
                            euOLrzqt.DbNXlk();
                        } else {
                            AbstractC5110Fc abstractC5110FcAEQbTJ10 = euOLrzqt.AEQbTJ();
                            if (abstractC5110FcAEQbTJ10.getClass() != AbstractC5110Fc.Dialog.class) {
                                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.Dialog.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ10.getClass()));
                            }
                            strCopydefault7 = ((AbstractC5110Fc.Dialog) abstractC5110FcAEQbTJ10).copydefault();
                        }
                        break;
                    default:
                        euOLrzqt.DbNXlk();
                        break;
                }
            }
        } catch (java.lang.Exception e) {
            throw new InvalidSsoTokenException("invalid cached SSO token", e);
        }
    }

    public static final byte[] copydefault(@NotNull PersistableBundle persistableBundle) {
        Intrinsics.checkNotNullParameter(persistableBundle, "");
        ET etCopydefault = C5108Fa.copydefault(true);
        etCopydefault.KWHzl();
        etCopydefault.KWHzl("accessToken");
        etCopydefault.AEQbTJ(persistableBundle.valueOf());
        etCopydefault.KWHzl("expiresAt");
        C5173Hn c5173HnAEQbTJ = persistableBundle.AEQbTJ();
        TimestampFormat timestampFormat = TimestampFormat.ISO_8601;
        etCopydefault.AEQbTJ(c5173HnAEQbTJ.OLrzqt(timestampFormat));
        KWHzl(etCopydefault, "refreshToken", persistableBundle.copydefault());
        KWHzl(etCopydefault, CoreNetworkModuleKt.KEY_CLIENT_ID, persistableBundle.EZpvd());
        KWHzl(etCopydefault, "clientSecret", persistableBundle.KWHzl());
        C5173Hn c5173HnAhwBna = persistableBundle.AhwBna();
        KWHzl(etCopydefault, "registrationExpiresAt", c5173HnAhwBna != null ? c5173HnAhwBna.OLrzqt(timestampFormat) : null);
        KWHzl(etCopydefault, "region", persistableBundle.gEmmrt());
        KWHzl(etCopydefault, "startUrl", persistableBundle.djBIcL());
        etCopydefault.EZpvd();
        byte[] bArrOLrzqt = etCopydefault.OLrzqt();
        if (bArrOLrzqt != null) {
            return bArrOLrzqt;
        }
        throw new java.lang.IllegalStateException("serializing SsoToken failed".toString());
    }

    public static final void KWHzl(ET et, java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return;
        }
        et.KWHzl(str);
        et.AEQbTJ(str2);
    }
}
