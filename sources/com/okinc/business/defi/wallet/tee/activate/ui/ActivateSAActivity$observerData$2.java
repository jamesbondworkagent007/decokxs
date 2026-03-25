package com.okinc.business.defi.wallet.tee.activate.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAActivity$observerData$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web.WebActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.ActivityC17792fSl;
import o.C13754dXa;
import o.C14725dqq;
import o.C16253egT;
import o.C17791fSk;
import o.C17877fVp;
import o.C17922fXg;
import o.C17927fXl;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C5335Nt;
import o.C5417Qx;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC17789fSi;
import o.InterfaceC49371unL;
import o.NN;
import o.dTH;
import o.pTB;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAActivity$observerData$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends ViewDataChanged>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$observerData$2(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$observerData$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivateSAActivity$observerData$2 activateSAActivity$observerData$2 = new ActivateSAActivity$observerData$2(this.this$0, continuation);
        activateSAActivity$observerData$2.L$0 = obj;
        return activateSAActivity$observerData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends ViewDataChanged> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<ViewDataChanged>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<ViewDataChanged> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$observerData$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC17792fSl AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, ActivityC17792fSl activityC17792fSl) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC17792fSl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ().KWHzl(this.AEQbTJ.AEQbTJ().AEQbTJ().getValue().isNeedToCreateNewAccount());
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.showLoadingWithLogo();
                } else {
                    C16253egT c16253egT = null;
                    String strKWHzl = "";
                    if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                        this.this$0.dismissLoadingWithLogo();
                        C16253egT c16253egT2 = this.this$0.OLrzqt;
                        if (c16253egT2 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT2 = null;
                        }
                        c16253egT2.AEQbTJ.setVisibility(0);
                        C16253egT c16253egT3 = this.this$0.OLrzqt;
                        if (c16253egT3 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT3 = null;
                        }
                        c16253egT3.AkhnZx.setVisibility(0);
                        C16253egT c16253egT4 = this.this$0.OLrzqt;
                        if (c16253egT4 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT4 = null;
                        }
                        c16253egT4.AYXKKw.setVisibility(0);
                        C16253egT c16253egT5 = this.this$0.OLrzqt;
                        if (c16253egT5 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT5 = null;
                        }
                        c16253egT5.djBIcL.setVisibility(8);
                        rVN.reportFullyDrawn$default((android.app.Activity) this.this$0, true, (String) null, 2, (Object) null);
                        ViewDataChanged viewDataChanged = (ViewDataChanged) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                        final AbstractC12782ctV wallet = viewDataChanged.getViewDataReady().getWallet();
                        this.this$0.KWHzl().AEQbTJ(wallet.DbNXlk());
                        C16253egT c16253egT6 = this.this$0.OLrzqt;
                        if (c16253egT6 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT6 = null;
                        }
                        c16253egT6.getFieldNames.setText(wallet.AkhnZx());
                        C16253egT c16253egT7 = this.this$0.OLrzqt;
                        if (c16253egT7 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT7 = null;
                        }
                        c16253egT7.fJNWhG.setText(viewDataChanged.getViewDataReady().getFormatterTotalFiat());
                        C16253egT c16253egT8 = this.this$0.OLrzqt;
                        if (c16253egT8 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT8 = null;
                        }
                        ShapeableImageView shapeableImageView = c16253egT8.gEmmrt;
                        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                        C14725dqq.copydefault(shapeableImageView, wallet.AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fSp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ActivateSAActivity$observerData$2.invokeSuspend$lambda$0((C5335Nt) obj2);
                            }
                        }, 48.0f);
                        C16253egT c16253egT9 = this.this$0.OLrzqt;
                        if (c16253egT9 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT9 = null;
                        }
                        c16253egT9.uzCIH.setText(C33069mpW.KWHzl(this.this$0, viewDataChanged.getAutoRenew() ? C13754dXa.FragmentManager.hCiIDQ : C13754dXa.FragmentManager.QezThh, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(viewDataChanged.getSelectedExpireTime())))));
                        C16253egT c16253egT10 = this.this$0.OLrzqt;
                        if (c16253egT10 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT10 = null;
                        }
                        ConstraintLayout constraintLayout = c16253egT10.fARcdN;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                        constraintLayout.setVisibility(this.this$0.AEQbTJ().AEQbTJ().getValue().getShowSelectWalletEntry() ? 0 : 8);
                        dTH dthOLrzqt = C17922fXg.OLrzqt(wallet);
                        final boolean z = viewDataChanged.getViewDataReady().getWaringInfo() != null;
                        C17927fXl c17927fXl = C17927fXl.KWHzl;
                        C16253egT c16253egT11 = this.this$0.OLrzqt;
                        if (c16253egT11 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT11 = null;
                        }
                        AppCompatImageView appCompatImageView = c16253egT11.valueOf;
                        TextView[] textViewArr = new TextView[1];
                        C16253egT c16253egT12 = this.this$0.OLrzqt;
                        if (c16253egT12 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT12 = null;
                        }
                        textViewArr[0] = c16253egT12.getFieldNames;
                        c17927fXl.OLrzqt(dthOLrzqt, appCompatImageView, false, textViewArr);
                        if (dthOLrzqt instanceof dTH.FragmentManager) {
                            C16253egT c16253egT13 = this.this$0.OLrzqt;
                            if (c16253egT13 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT13 = null;
                            }
                            View view = c16253egT13.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(view, "");
                            view.setVisibility(0);
                            C16253egT c16253egT14 = this.this$0.OLrzqt;
                            if (c16253egT14 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT14 = null;
                            }
                            AppCompatTextView appCompatTextView = c16253egT14.AuCTel;
                            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                            appCompatTextView.setVisibility(z ? 0 : 8);
                            C16253egT c16253egT15 = this.this$0.OLrzqt;
                            if (c16253egT15 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT15 = null;
                            }
                            Group group = c16253egT15.getNewProxyInstance;
                            Intrinsics.checkNotNullExpressionValue(group, "");
                            group.setVisibility(z ^ true ? 0 : 8);
                            C16253egT c16253egT16 = this.this$0.OLrzqt;
                            if (c16253egT16 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT16 = null;
                            }
                            AppCompatTextView appCompatTextView2 = c16253egT16.AuCTel;
                            InterfaceC17789fSi waringInfo = viewDataChanged.getViewDataReady().getWaringInfo();
                            appCompatTextView2.setText(waringInfo != null ? waringInfo.copydefault(this.this$0) : null);
                            if (z) {
                                this.this$0.AEQbTJ(C13754dXa.FragmentManager.SdSTJp);
                                C16253egT c16253egT17 = this.this$0.OLrzqt;
                                if (c16253egT17 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT17 = null;
                                }
                                c16253egT17.KWHzl.setEnabled(false);
                                C16253egT c16253egT18 = this.this$0.OLrzqt;
                                if (c16253egT18 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT18 = null;
                                }
                                c16253egT18.KWHzl.setOKDSType(257);
                                C16253egT c16253egT19 = this.this$0.OLrzqt;
                                if (c16253egT19 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT19 = null;
                                }
                                c16253egT19.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.SqfPTR));
                            } else {
                                this.this$0.AEQbTJ(C13754dXa.FragmentManager.RZOtbZ);
                                C16253egT c16253egT20 = this.this$0.OLrzqt;
                                if (c16253egT20 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT20 = null;
                                }
                                c16253egT20.KWHzl.setEnabled(true);
                                C16253egT c16253egT21 = this.this$0.OLrzqt;
                                if (c16253egT21 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT21 = null;
                                }
                                c16253egT21.KWHzl.setOKDSType(257);
                                C16253egT c16253egT22 = this.this$0.OLrzqt;
                                if (c16253egT22 == null) {
                                    Intrinsics.gEmmrt("");
                                    c16253egT22 = null;
                                }
                                c16253egT22.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.SqfPTR));
                            }
                            if (z && viewDataChanged.getEnableBtnIsClicked()) {
                                this.this$0.EZpvd();
                                if (viewDataChanged.getViewDataReady().getWaringInfo() instanceof C17791fSk) {
                                    strKWHzl = C33069mpW.KWHzl(this.this$0, C13754dXa.FragmentManager.PUZqN, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(C33129mqd.gEmmrt(C56443yFo.KWHzl(viewDataChanged.getViewDataReady().getTeeMetaData().getUpgradeAssetThreshold())), null, 1, null))));
                                } else {
                                    InterfaceC17789fSi waringInfo2 = viewDataChanged.getViewDataReady().getWaringInfo();
                                    String strCopydefault = waringInfo2 != null ? waringInfo2.copydefault(this.this$0) : null;
                                    if (strCopydefault != null) {
                                        strKWHzl = strCopydefault;
                                    }
                                }
                                this.this$0.copydefault(viewDataChanged.getViewDataReady().getWallet().AkhnZx(), strKWHzl);
                            }
                        } else if (dthOLrzqt instanceof dTH.Activity) {
                            this.this$0.OLrzqt();
                            C16253egT c16253egT23 = this.this$0.OLrzqt;
                            if (c16253egT23 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT23 = null;
                            }
                            AppCompatTextView appCompatTextView3 = c16253egT23.AuCTel;
                            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                            appCompatTextView3.setVisibility(8);
                            C16253egT c16253egT24 = this.this$0.OLrzqt;
                            if (c16253egT24 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT24 = null;
                            }
                            View view2 = c16253egT24.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(view2, "");
                            view2.setVisibility(8);
                            C16253egT c16253egT25 = this.this$0.OLrzqt;
                            if (c16253egT25 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT25 = null;
                            }
                            Group group2 = c16253egT25.getNewProxyInstance;
                            Intrinsics.checkNotNullExpressionValue(group2, "");
                            group2.setVisibility(8);
                            C16253egT c16253egT26 = this.this$0.OLrzqt;
                            if (c16253egT26 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT26 = null;
                            }
                            c16253egT26.KWHzl.setEnabled(true);
                            C16253egT c16253egT27 = this.this$0.OLrzqt;
                            if (c16253egT27 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT27 = null;
                            }
                            c16253egT27.KWHzl.setOKDSType(257);
                            C16253egT c16253egT28 = this.this$0.OLrzqt;
                            if (c16253egT28 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT28 = null;
                            }
                            c16253egT28.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.hUfVAv));
                        } else if (dthOLrzqt instanceof dTH.Application) {
                            this.this$0.AEQbTJ(C13754dXa.FragmentManager.SePrCP);
                            C16253egT c16253egT29 = this.this$0.OLrzqt;
                            if (c16253egT29 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT29 = null;
                            }
                            AppCompatTextView appCompatTextView4 = c16253egT29.AuCTel;
                            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                            appCompatTextView4.setVisibility(8);
                            C16253egT c16253egT30 = this.this$0.OLrzqt;
                            if (c16253egT30 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT30 = null;
                            }
                            View view3 = c16253egT30.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(view3, "");
                            view3.setVisibility(0);
                            C16253egT c16253egT31 = this.this$0.OLrzqt;
                            if (c16253egT31 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT31 = null;
                            }
                            Group group3 = c16253egT31.getNewProxyInstance;
                            Intrinsics.checkNotNullExpressionValue(group3, "");
                            group3.setVisibility(0);
                            C16253egT c16253egT32 = this.this$0.OLrzqt;
                            if (c16253egT32 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT32 = null;
                            }
                            c16253egT32.KWHzl.setEnabled(true);
                            C16253egT c16253egT33 = this.this$0.OLrzqt;
                            if (c16253egT33 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT33 = null;
                            }
                            c16253egT33.KWHzl.setOKDSType(257);
                            C16253egT c16253egT34 = this.this$0.OLrzqt;
                            if (c16253egT34 == null) {
                                Intrinsics.gEmmrt("");
                                c16253egT34 = null;
                            }
                            c16253egT34.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.SqfPTR));
                        }
                        if (!this.this$0.EZpvd) {
                            this.this$0.EZpvd = true;
                            final ActivityC17792fSl activityC17792fSl = this.this$0;
                            C32866mlf.onEvent$default("Web3WalletEnableSmartAccountPage_Page_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fSo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return ActivateSAActivity$observerData$2.invokeSuspend$lambda$1(z, activityC17792fSl, (EventParamsList) obj2);
                                }
                            }, 1, (Object) null);
                        }
                        if (C33129mqd.OLrzqt(C56443yFo.AEQbTJ(C17922fXg.EZpvd(viewDataChanged.getViewDataReady().getTeeMetaData())), C56443yFo.AEQbTJ(1))) {
                            this.this$0.EZpvd();
                            C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
                            final ActivityC17792fSl activityC17792fSl2 = this.this$0;
                            Function0<Unit> function0 = new Function0() { // from class: o.fSu
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ActivateSAActivity$observerData$2.invokeSuspend$lambda$2(activityC17792fSl2);
                                }
                            };
                            final ActivityC17792fSl activityC17792fSl3 = this.this$0;
                            c17877fVpOLrzqt.AEQbTJ(activityC17792fSl2, function0, new Function0() { // from class: o.fSs
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ActivateSAActivity$observerData$2.invokeSuspend$lambda$5(activityC17792fSl3);
                                }
                            });
                        } else if (viewDataChanged.getViewDataReady().getTeeMetaData().isTeeServiceMaintenance()) {
                            this.this$0.EZpvd();
                            C17877fVp c17877fVpOLrzqt2 = C17877fVp.Companion.OLrzqt();
                            final ActivityC17792fSl activityC17792fSl4 = this.this$0;
                            C17877fVp.showServiceUnavailableDialog$default(c17877fVpOLrzqt2, activityC17792fSl4, new Function0() { // from class: o.fSr
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ActivateSAActivity$observerData$2.invokeSuspend$lambda$6(activityC17792fSl4, wallet);
                                }
                            }, null, 4, null);
                        }
                    } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                        this.this$0.dismissLoadingWithLogo();
                        pUU.copydefault(this.this$0.getTAG(), "ui error message = " + ((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ().getMessage());
                        C16253egT c16253egT35 = this.this$0.OLrzqt;
                        if (c16253egT35 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT35 = null;
                        }
                        c16253egT35.AEQbTJ.setVisibility(0);
                        C16253egT c16253egT36 = this.this$0.OLrzqt;
                        if (c16253egT36 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT36 = null;
                        }
                        c16253egT36.AkhnZx.setVisibility(4);
                        C16253egT c16253egT37 = this.this$0.OLrzqt;
                        if (c16253egT37 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT37 = null;
                        }
                        c16253egT37.AYXKKw.setVisibility(4);
                        C16253egT c16253egT38 = this.this$0.OLrzqt;
                        if (c16253egT38 == null) {
                            Intrinsics.gEmmrt("");
                            c16253egT38 = null;
                        }
                        c16253egT38.djBIcL.setVisibility(0);
                        C16253egT c16253egT39 = this.this$0.OLrzqt;
                        if (c16253egT39 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c16253egT = c16253egT39;
                        }
                        C55173xeu c55173xeu = c16253egT.djBIcL;
                        c55173xeu.setOnClickListener(new Activity(c55173xeu, 1000L, this.this$0));
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C5335Nt c5335Nt) {
        c5335Nt.EZpvd((NN<Bitmap>) new C5417Qx(C55298xhM.dp2px$default(6.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(boolean z, ActivityC17792fSl activityC17792fSl, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "button", z ? "Ok" : "Enable", false, 4, null);
        eventParamsList.put("path_source", activityC17792fSl.AYXKKw(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(ActivityC17792fSl activityC17792fSl) {
        activityC17792fSl.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(ActivityC17792fSl activityC17792fSl) {
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putString("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.SlnMSS));
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC17792fSl, bundleBundleOf, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(ActivityC17792fSl activityC17792fSl, AbstractC12782ctV abstractC12782ctV) {
        activityC17792fSl.copydefault(NotificationStateType.Other, abstractC12782ctV.AkhnZx(), true);
        return Unit.INSTANCE;
    }
}
