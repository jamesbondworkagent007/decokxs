package o;

import com.okinc.localization.bean.LanguageItem;
import com.okinc.preference.domain.PreferenceManagerImpl$getDisplayLocaleV2$1;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.pTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXT extends AbstractC43215rlA implements InterfaceC46554tYq {
    public final tXD AEQbTJ;
    public final pTU OLrzqt;

    @yCM
    public tXT(@NotNull pTU ptu, @NotNull tXD txd) {
        Intrinsics.checkNotNullParameter(ptu, "");
        Intrinsics.checkNotNullParameter(txd, "");
        this.OLrzqt = ptu;
        this.AEQbTJ = txd;
    }

    @Override // o.InterfaceC46554tYq
    public void AEQbTJ(boolean z) {
        tXS.AEQbTJ.OLrzqt(z);
    }

    @Override // o.InterfaceC46554tYq
    public boolean copydefault() {
        return tXS.AEQbTJ.AEQbTJ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(12:12|75|13|35|36|37|(5:39|(5:42|(1:44)(1:45)|46|(2:85|83)(2:82|49)|40)|80|50|51)(1:52)|53|62|(1:65)|66|(1:71)(1:86))(2:17|18))(4:19|73|20|21))(4:24|77|25|(1:27)(1:28))|78|29|(2:31|(1:33)(3:34|35|36))|37|(0)(0)|53|62|(0)|66|(1:68)|71|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        r2 = r8;
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:37:0x0085, B:39:0x0091, B:40:0x0095, B:42:0x009b, B:44:0x00a6, B:46:0x00ac, B:49:0x00b8, B:53:0x00c4, B:50:0x00bb, B:51:0x00c2, B:25:0x0056), top: B:77:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC46554tYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull LanguageItem.NameType nameType, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        PreferenceManagerImpl$getDisplayLocaleV2$1 preferenceManagerImpl$getDisplayLocaleV2$1;
        LanguageItem.NameType nameType2;
        java.lang.Throwable th;
        java.lang.Object obj;
        tXT txt;
        java.util.List list;
        tXT txt2;
        java.lang.Object objM7377constructorimpl;
        java.lang.String displayNameWithType;
        LanguageItem languageItem;
        if (continuation instanceof PreferenceManagerImpl$getDisplayLocaleV2$1) {
            preferenceManagerImpl$getDisplayLocaleV2$1 = (PreferenceManagerImpl$getDisplayLocaleV2$1) continuation;
            int i = preferenceManagerImpl$getDisplayLocaleV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preferenceManagerImpl$getDisplayLocaleV2$1.label = i - Integer.MIN_VALUE;
            } else {
                preferenceManagerImpl$getDisplayLocaleV2$1 = new PreferenceManagerImpl$getDisplayLocaleV2$1(this, continuation);
            }
        }
        java.lang.Object obj2 = preferenceManagerImpl$getDisplayLocaleV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preferenceManagerImpl$getDisplayLocaleV2$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            try {
                Result.Application application = Result.Companion;
                pTU ptu = this.OLrzqt;
                preferenceManagerImpl$getDisplayLocaleV2$1.L$0 = nameType;
                preferenceManagerImpl$getDisplayLocaleV2$1.L$1 = this;
                preferenceManagerImpl$getDisplayLocaleV2$1.label = 1;
                java.lang.Object languageListFromLocal$default = pTU.StateListAnimator.getLanguageListFromLocal$default(ptu, null, preferenceManagerImpl$getDisplayLocaleV2$1, 1, null);
                if (languageListFromLocal$default == objCopydefault) {
                    return objCopydefault;
                }
                obj = languageListFromLocal$default;
                txt = this;
            } catch (java.lang.Throwable th2) {
                nameType2 = nameType;
                th = th2;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                nameType = nameType2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                txt2 = (tXT) preferenceManagerImpl$getDisplayLocaleV2$1.L$1;
                nameType2 = (LanguageItem.NameType) preferenceManagerImpl$getDisplayLocaleV2$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    list = (java.util.List) obj2;
                    txt = txt2;
                    nameType = nameType2;
                    java.lang.String languageCode = txt.OLrzqt.OLrzqt().getLanguageCode();
                    if (list == null) {
                        for (java.lang.Object obj3 : list) {
                            LanguageItem languageItem2 = (LanguageItem) obj3;
                            boolean hideInCefiMode = nameType == LanguageItem.NameType.CEFI ? languageItem2.getHideInCefiMode() : false;
                            if (Intrinsics.EZpvd((java.lang.Object) languageItem2.getLanguageCode(), (java.lang.Object) languageCode) && !hideInCefiMode) {
                                languageItem = (LanguageItem) obj3;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    languageItem = null;
                    objM7377constructorimpl = Result.m7377constructorimpl(languageItem);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    nameType = nameType2;
                }
                LanguageItem languageItem3 = (LanguageItem) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                return (languageItem3 != null || (displayNameWithType = languageItem3.getDisplayNameWithType(nameType)) == null) ? "" : displayNameWithType;
            }
            tXT txt3 = (tXT) preferenceManagerImpl$getDisplayLocaleV2$1.L$1;
            LanguageItem.NameType nameType3 = (LanguageItem.NameType) preferenceManagerImpl$getDisplayLocaleV2$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj2);
                txt = txt3;
                nameType = nameType3;
                obj = obj2;
            } catch (java.lang.Throwable th4) {
                th = th4;
                nameType2 = nameType3;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                nameType = nameType2;
                LanguageItem languageItem32 = (LanguageItem) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (languageItem32 != null) {
                }
            }
        }
        list = (java.util.List) obj;
        if (list == null) {
            pTU ptu2 = txt.OLrzqt;
            preferenceManagerImpl$getDisplayLocaleV2$1.L$0 = nameType;
            preferenceManagerImpl$getDisplayLocaleV2$1.L$1 = txt;
            preferenceManagerImpl$getDisplayLocaleV2$1.label = 2;
            java.lang.Object languageListFromRemote$default = pTU.StateListAnimator.getLanguageListFromRemote$default(ptu2, null, preferenceManagerImpl$getDisplayLocaleV2$1, 1, null);
            if (languageListFromRemote$default == objCopydefault) {
                return objCopydefault;
            }
            nameType2 = nameType;
            txt2 = txt;
            obj2 = languageListFromRemote$default;
            list = (java.util.List) obj2;
            txt = txt2;
            nameType = nameType2;
        }
        java.lang.String languageCode2 = txt.OLrzqt.OLrzqt().getLanguageCode();
        if (list == null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(languageItem);
        LanguageItem languageItem322 = (LanguageItem) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (languageItem322 != null) {
        }
    }

    @Override // o.InterfaceC46554tYq
    public int KWHzl() {
        return tXD.getArrowResource$default(this.AEQbTJ, 0, 0, 3, null);
    }

    @Override // o.InterfaceC46554tYq
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ.copydefault();
    }
}
