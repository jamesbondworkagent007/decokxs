package o;

import com.okinc.okex.lite.hero.data.model.HeroContent;
import com.okinc.okex.lite.hero.data.model.HeroResponseModel;
import com.okinc.okex.lite.hero.data.model.HeroResponseRootModel;
import com.okinc.okex.lite.hero.data.model.HeroSection;
import com.okinc.okex.lite.hero.data.model.HeroTabBarItem;
import com.okinc.okex.lite.hero.usecase.UpdateHeroSectionCacheUseCase$createDownloadFlow$1;
import com.okinc.okex.lite.hero.usecase.UpdateHeroSectionCacheUseCase$invoke$1;
import com.okinc.okex.lite.hero.usecase.UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1;
import com.okinc.okex.lite.hero.usecase.UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43419rot;
import o.svM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45708svD {
    public final C45714svK AEQbTJ;
    public final InterfaceC45723svf EZpvd;
    public final android.content.Context copydefault;

    @yCM
    public C45708svD(@NotNull InterfaceC45723svf interfaceC45723svf, @NotNull C45714svK c45714svK, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        Intrinsics.checkNotNullParameter(c45714svK, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = interfaceC45723svf;
        this.AEQbTJ = c45714svK;
        this.copydefault = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        UpdateHeroSectionCacheUseCase$invoke$1 updateHeroSectionCacheUseCase$invoke$1;
        C45708svD c45708svD;
        HeroResponseModel heroResponseModel;
        C45708svD c45708svD2;
        java.util.List<? extends kotlin.Pair<? extends Flow<? extends svM>, java.lang.String>> list;
        HeroSection heroSectionOLrzqt;
        if (continuation instanceof UpdateHeroSectionCacheUseCase$invoke$1) {
            updateHeroSectionCacheUseCase$invoke$1 = (UpdateHeroSectionCacheUseCase$invoke$1) continuation;
            int i = updateHeroSectionCacheUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateHeroSectionCacheUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateHeroSectionCacheUseCase$invoke$1 = new UpdateHeroSectionCacheUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = updateHeroSectionCacheUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateHeroSectionCacheUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase invoked");
            InterfaceC45723svf interfaceC45723svf = this.EZpvd;
            updateHeroSectionCacheUseCase$invoke$1.L$0 = this;
            updateHeroSectionCacheUseCase$invoke$1.label = 1;
            objKWHzl = interfaceC45723svf.KWHzl(updateHeroSectionCacheUseCase$invoke$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c45708svD = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    return Unit.INSTANCE;
                }
                heroResponseModel = (HeroResponseModel) updateHeroSectionCacheUseCase$invoke$1.L$1;
                c45708svD2 = (C45708svD) updateHeroSectionCacheUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                list = (java.util.List) objKWHzl;
                pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase downloadRequests " + list.size());
                heroSectionOLrzqt = C45672suU.OLrzqt(heroResponseModel);
                updateHeroSectionCacheUseCase$invoke$1.L$0 = null;
                updateHeroSectionCacheUseCase$invoke$1.L$1 = null;
                updateHeroSectionCacheUseCase$invoke$1.label = 5;
                if (c45708svD2.EZpvd(heroSectionOLrzqt, list, updateHeroSectionCacheUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            c45708svD = (C45708svD) updateHeroSectionCacheUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase heroSectionResponse " + abstractC43419rot);
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
            InterfaceC45723svf interfaceC45723svf2 = c45708svD.EZpvd;
            updateHeroSectionCacheUseCase$invoke$1.L$0 = null;
            updateHeroSectionCacheUseCase$invoke$1.label = 2;
            if (interfaceC45723svf2.KWHzl(null, updateHeroSectionCacheUseCase$invoke$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        HeroResponseRootModel heroResponseRootModel = (HeroResponseRootModel) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
        HeroResponseModel heroResponseModelEZpvd = heroResponseRootModel != null ? heroResponseRootModel.EZpvd() : null;
        if (heroResponseModelEZpvd == null || !heroResponseModelEZpvd.OLrzqt()) {
            InterfaceC45723svf interfaceC45723svf3 = c45708svD.EZpvd;
            updateHeroSectionCacheUseCase$invoke$1.L$0 = null;
            updateHeroSectionCacheUseCase$invoke$1.label = 3;
            if (interfaceC45723svf3.KWHzl(null, updateHeroSectionCacheUseCase$invoke$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        HeroSection heroSectionCopydefault = c45708svD.EZpvd.copydefault();
        HeroSection heroSectionOLrzqt2 = C45672suU.OLrzqt(heroResponseModelEZpvd);
        updateHeroSectionCacheUseCase$invoke$1.L$0 = c45708svD;
        updateHeroSectionCacheUseCase$invoke$1.L$1 = heroResponseModelEZpvd;
        updateHeroSectionCacheUseCase$invoke$1.label = 4;
        java.lang.Object objKWHzl2 = c45708svD.KWHzl(heroSectionOLrzqt2, heroSectionCopydefault, updateHeroSectionCacheUseCase$invoke$1);
        if (objKWHzl2 == objCopydefault) {
            return objCopydefault;
        }
        C45708svD c45708svD3 = c45708svD;
        heroResponseModel = heroResponseModelEZpvd;
        objKWHzl = objKWHzl2;
        c45708svD2 = c45708svD3;
        list = (java.util.List) objKWHzl;
        pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase downloadRequests " + list.size());
        heroSectionOLrzqt = C45672suU.OLrzqt(heroResponseModel);
        updateHeroSectionCacheUseCase$invoke$1.L$0 = null;
        updateHeroSectionCacheUseCase$invoke$1.L$1 = null;
        updateHeroSectionCacheUseCase$invoke$1.label = 5;
        if (c45708svD2.EZpvd(heroSectionOLrzqt, list, updateHeroSectionCacheUseCase$invoke$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=5] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(HeroSection heroSection, HeroSection heroSection2, Continuation<? super java.util.List<? extends kotlin.Pair<? extends Flow<? extends svM>, java.lang.String>>> continuation) throws java.lang.Throwable {
        UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1 updateHeroSectionCacheUseCase$prepareDownloadRequests$1;
        java.lang.Object[] objArr;
        java.lang.Object objEZpvd;
        HeroSection heroSection3;
        HeroSection heroSection4;
        java.lang.Object[] objArr2;
        int i;
        C45708svD c45708svD;
        HeroContent heroContentKWHzl;
        HeroContent heroContentKWHzl2;
        java.lang.Object[] objArr3;
        HeroSection heroSection5;
        HeroSection heroSection6;
        C45708svD c45708svD2;
        java.lang.Object[] objArr4;
        HeroContent heroContentKWHzl3;
        HeroContent heroContentKWHzl4;
        java.lang.Object[] objArr5;
        HeroSection heroSection7;
        C45708svD c45708svD3;
        HeroTabBarItem heroTabBarItemAEQbTJ;
        HeroTabBarItem heroTabBarItemAEQbTJ2;
        java.lang.Object[] objArr6;
        HeroTabBarItem heroTabBarItemAEQbTJ3;
        HeroTabBarItem heroTabBarItemAEQbTJ4;
        if (continuation instanceof UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1) {
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1 = (UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1) continuation;
            int i2 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = i2 - Integer.MIN_VALUE;
            } else {
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1 = new UpdateHeroSectionCacheUseCase$prepareDownloadRequests$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label;
        int i4 = 1;
        int i5 = 2;
        int i6 = 3;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            objArr = new kotlin.Pair[4];
            java.lang.String strAEQbTJ = (heroSection2 == null || (heroContentKWHzl2 = heroSection2.KWHzl()) == null) ? null : heroContentKWHzl2.AEQbTJ();
            java.lang.String strKWHzl = (heroSection2 == null || (heroContentKWHzl = heroSection2.KWHzl()) == null) ? null : heroContentKWHzl.KWHzl();
            java.lang.String strAEQbTJ2 = heroSection.KWHzl().AEQbTJ();
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = this;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = heroSection;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = heroSection2;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = objArr;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = objArr;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 0;
            updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 1;
            objEZpvd = EZpvd(strAEQbTJ, strKWHzl, strAEQbTJ2, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            heroSection3 = heroSection;
            heroSection4 = heroSection2;
            objArr2 = objArr;
            i = 0;
            c45708svD = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i6 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0;
                        java.lang.Object[] objArr7 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1;
                        objArr3 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd2);
                        objArr6 = objArr7;
                        objArr6[i6] = objEZpvd2;
                        return yDY.gEmmrt(objArr3);
                    }
                    i5 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0;
                    java.lang.Object[] objArr8 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4;
                    objArr3 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3;
                    heroSection5 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2;
                    heroSection7 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1;
                    c45708svD3 = (C45708svD) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd2);
                    objArr5 = objArr8;
                    objArr5[i5] = objEZpvd2;
                    java.lang.String strCopydefault = (heroSection5 != null || (heroTabBarItemAEQbTJ4 = heroSection5.AEQbTJ()) == null) ? null : heroTabBarItemAEQbTJ4.copydefault();
                    java.lang.String strOLrzqt = (heroSection5 != null || (heroTabBarItemAEQbTJ3 = heroSection5.AEQbTJ()) == null) ? null : heroTabBarItemAEQbTJ3.OLrzqt();
                    java.lang.String strCopydefault2 = heroSection7.AEQbTJ().copydefault();
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = objArr3;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = objArr3;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = null;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = null;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = null;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 3;
                    updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 4;
                    objEZpvd2 = c45708svD3.EZpvd(strCopydefault, strOLrzqt, strCopydefault2, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
                    if (objEZpvd2 != objCopydefault) {
                        return objCopydefault;
                    }
                    objArr6 = objArr3;
                    objArr6[i6] = objEZpvd2;
                    return yDY.gEmmrt(objArr3);
                }
                i4 = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0;
                java.lang.Object[] objArr9 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4;
                objArr3 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3;
                heroSection5 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2;
                heroSection6 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1;
                c45708svD2 = (C45708svD) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                objArr4 = objArr9;
                objArr4[i4] = objEZpvd2;
                java.lang.String strKWHzl2 = (heroSection5 != null || (heroTabBarItemAEQbTJ2 = heroSection5.AEQbTJ()) == null) ? null : heroTabBarItemAEQbTJ2.KWHzl();
                java.lang.String strEZpvd = (heroSection5 != null || (heroTabBarItemAEQbTJ = heroSection5.AEQbTJ()) == null) ? null : heroTabBarItemAEQbTJ.EZpvd();
                java.lang.String strKWHzl3 = heroSection6.AEQbTJ().KWHzl();
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = c45708svD2;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = heroSection6;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = heroSection5;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = objArr3;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = objArr3;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 2;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 3;
                objEZpvd2 = c45708svD2.EZpvd(strKWHzl2, strEZpvd, strKWHzl3, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
                if (objEZpvd2 != objCopydefault) {
                    return objCopydefault;
                }
                objArr5 = objArr3;
                heroSection7 = heroSection6;
                c45708svD3 = c45708svD2;
                objArr5[i5] = objEZpvd2;
                if (heroSection5 != null) {
                    if (heroSection5 != null) {
                        java.lang.String strCopydefault22 = heroSection7.AEQbTJ().copydefault();
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = objArr3;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = objArr3;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = null;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = null;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = null;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 3;
                        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 4;
                        objEZpvd2 = c45708svD3.EZpvd(strCopydefault, strOLrzqt, strCopydefault22, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
                        if (objEZpvd2 != objCopydefault) {
                        }
                    }
                }
                objArr6[i6] = objEZpvd2;
                return yDY.gEmmrt(objArr3);
            }
            i = updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0;
            java.lang.Object[] objArr10 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4;
            java.lang.Object[] objArr11 = (kotlin.Pair[]) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3;
            heroSection4 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2;
            heroSection3 = (HeroSection) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1;
            c45708svD = (C45708svD) updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
            objEZpvd = objEZpvd2;
            objArr = objArr11;
            objArr2 = objArr10;
        }
        objArr2[i] = objEZpvd;
        java.lang.String strOLrzqt2 = (heroSection4 == null || (heroContentKWHzl4 = heroSection4.KWHzl()) == null) ? null : heroContentKWHzl4.OLrzqt();
        java.lang.String strCopydefault3 = (heroSection4 == null || (heroContentKWHzl3 = heroSection4.KWHzl()) == null) ? null : heroContentKWHzl3.copydefault();
        java.lang.String strOLrzqt3 = heroSection3.KWHzl().OLrzqt();
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = c45708svD;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = heroSection3;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = heroSection4;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = objArr;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = objArr;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 1;
        updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 2;
        java.lang.Object objEZpvd3 = c45708svD.EZpvd(strOLrzqt2, strCopydefault3, strOLrzqt3, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
        if (objEZpvd3 == objCopydefault) {
            return objCopydefault;
        }
        objArr3 = objArr;
        heroSection5 = heroSection4;
        heroSection6 = heroSection3;
        c45708svD2 = c45708svD;
        objEZpvd2 = objEZpvd3;
        objArr4 = objArr3;
        objArr4[i4] = objEZpvd2;
        if (heroSection5 != null) {
            if (heroSection5 != null) {
                java.lang.String strKWHzl32 = heroSection6.AEQbTJ().KWHzl();
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$0 = c45708svD2;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$1 = heroSection6;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$2 = heroSection5;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$3 = objArr3;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.L$4 = objArr3;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.I$0 = 2;
                updateHeroSectionCacheUseCase$prepareDownloadRequests$1.label = 3;
                objEZpvd2 = c45708svD2.EZpvd(strKWHzl2, strEZpvd, strKWHzl32, updateHeroSectionCacheUseCase$prepareDownloadRequests$1);
                if (objEZpvd2 != objCopydefault) {
                }
            }
        }
        objArr6[i6] = objEZpvd2;
        return yDY.gEmmrt(objArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super kotlin.Pair<? extends Flow<? extends svM>, java.lang.String>> continuation) throws java.lang.Throwable {
        UpdateHeroSectionCacheUseCase$createDownloadFlow$1 updateHeroSectionCacheUseCase$createDownloadFlow$1;
        if (continuation instanceof UpdateHeroSectionCacheUseCase$createDownloadFlow$1) {
            updateHeroSectionCacheUseCase$createDownloadFlow$1 = (UpdateHeroSectionCacheUseCase$createDownloadFlow$1) continuation;
            int i = updateHeroSectionCacheUseCase$createDownloadFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateHeroSectionCacheUseCase$createDownloadFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                updateHeroSectionCacheUseCase$createDownloadFlow$1 = new UpdateHeroSectionCacheUseCase$createDownloadFlow$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = updateHeroSectionCacheUseCase$createDownloadFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateHeroSectionCacheUseCase$createDownloadFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (str == null || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str3) || str2 == null) {
                C45714svK c45714svK = this.AEQbTJ;
                C45709svE c45709svE = new C45709svE(str3);
                android.content.Context context = this.copydefault;
                updateHeroSectionCacheUseCase$createDownloadFlow$1.L$0 = str3;
                updateHeroSectionCacheUseCase$createDownloadFlow$1.label = 1;
                objKWHzl = c45714svK.KWHzl(c45709svE, context, updateHeroSectionCacheUseCase$createDownloadFlow$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return C56390yDp.OLrzqt(FlowKt.flowOf(new svM.ActionBar(str2)), str);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) updateHeroSectionCacheUseCase$createDownloadFlow$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return C56390yDp.OLrzqt(objKWHzl, str3);
    }

    public final java.lang.Object EZpvd(HeroSection heroSection, java.util.List<? extends kotlin.Pair<? extends Flow<? extends svM>, java.lang.String>> list, Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = FlowKt.combine(list.get(0).getFirst(), list.get(1).getFirst(), list.get(2).getFirst(), list.get(3).getFirst(), new UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2(null)).collect(new Application(heroSection), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.svD$Application */
    public static final class Application<T> implements FlowCollector {
        public final /* synthetic */ HeroSection OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(HeroSection heroSection) {
            this.OLrzqt = heroSection;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<? extends svM> list, Continuation<? super Unit> continuation) {
            pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase downloadResults " + list);
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!(((svM) it.next()) instanceof svM.ActionBar)) {
                        return Unit.INSTANCE;
                    }
                }
            }
            java.lang.Object objKWHzl = C45708svD.this.KWHzl(this.OLrzqt, list, continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okex.lite.hero.data.model.HeroSection.copy$default(com.okinc.okex.lite.hero.data.model.HeroSection, boolean, com.okinc.okex.lite.hero.data.model.HeroContent, com.okinc.okex.lite.hero.data.model.HeroTabBarItem, int, java.lang.Object):com.okinc.okex.lite.hero.data.model.HeroSection */
    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okex.lite.hero.data.model.HeroTabBarItem.copy$default(com.okinc.okex.lite.hero.data.model.HeroTabBarItem, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Object):com.okinc.okex.lite.hero.data.model.HeroTabBarItem */
    public final java.lang.Object KWHzl(HeroSection heroSection, java.util.List<? extends svM> list, Continuation<? super Unit> continuation) {
        svM svm = list.get(0);
        Intrinsics.copydefault(svm, "");
        java.lang.String strEZpvd = ((svM.ActionBar) svm).EZpvd();
        svM svm2 = list.get(1);
        Intrinsics.copydefault(svm2, "");
        java.lang.String strEZpvd2 = ((svM.ActionBar) svm2).EZpvd();
        svM svm3 = list.get(2);
        Intrinsics.copydefault(svm3, "");
        java.lang.String strEZpvd3 = ((svM.ActionBar) svm3).EZpvd();
        svM svm4 = list.get(3);
        Intrinsics.copydefault(svm4, "");
        java.lang.String strEZpvd4 = ((svM.ActionBar) svm4).EZpvd();
        pUU.copydefault("LiteHeroPage", "UpdateHeroSectionCacheUseCase updateCacheWithDownloadedData: " + strEZpvd + " " + strEZpvd2 + " " + strEZpvd3 + " " + strEZpvd4);
        InterfaceC45723svf interfaceC45723svf = this.EZpvd;
        HeroContent heroContentKWHzl = heroSection.KWHzl();
        java.lang.Object objKWHzl = interfaceC45723svf.KWHzl(HeroSection.copy$default(heroSection, false, heroContentKWHzl.AEQbTJ((250 & 1) != 0 ? heroContentKWHzl.contentImageDay : strEZpvd, (250 & 2) != 0 ? heroContentKWHzl.contentImageDayRemote : null, (250 & 4) != 0 ? heroContentKWHzl.contentImageNight : strEZpvd2, (250 & 8) != 0 ? heroContentKWHzl.contentImageNightRemote : null, (250 & 16) != 0 ? heroContentKWHzl.hasAnimation : false, (250 & 32) != 0 ? heroContentKWHzl.title : null, (250 & 64) != 0 ? heroContentKWHzl.description : null, (250 & 128) != 0 ? heroContentKWHzl.cta : null), HeroTabBarItem.copy$default(heroSection.AEQbTJ(), null, strEZpvd3, null, strEZpvd4, null, 0, 53, null), 1, null), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
