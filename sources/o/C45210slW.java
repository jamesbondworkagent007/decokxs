package o;

import com.okinc.localization.bean.RemoteUpdateStatus;
import com.okinc.mln.miniapp.MiniAppUpdateError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.combinedresource.CombinedResourceUpdater$init$1$onAppFirstRenderFinished$1;
import com.okinc.okex.combinedresource.CombinedResourceUpdater$init$3;
import com.okinc.resource.request.CombinedResourceResponse;
import com.okinc.resource.request.MlnUpdateRequest;
import com.okinc.resource.request.MlnUpdateResp;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.slW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45210slW {
    public static final C45210slW KWHzl = new C45210slW();

    private C45210slW() {
    }

    /* JADX INFO: renamed from: o.slW$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54816xWj {
        public boolean KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.KWHzl = z;
        }

        public StateListAnimator(android.content.Context context) {
            this.OLrzqt = context;
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            super.EZpvd();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new CombinedResourceUpdater$init$1$onAppFirstRenderFinished$1(this, null), 3, null);
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(android.app.Activity activity) {
            if (this.KWHzl) {
                C45210slW.requestUpdate$default(C45210slW.KWHzl, this.OLrzqt, false, false, 6, null);
            }
        }
    }

    public final void EZpvd(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C54819xWm.KWHzl().AEQbTJ(new StateListAnimator(context));
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_account_login");
        final Function1 function1 = new Function1() { // from class: o.slY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45210slW.EZpvd(context, (java.lang.String) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.smd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C45210slW.EZpvd(function1, obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new CombinedResourceUpdater$init$3(context, null), 3, null);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(android.content.Context context, java.lang.String str) {
        KWHzl.copydefault(context, false, false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void requestUpdate$default(C45210slW c45210slW, android.content.Context context, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c45210slW.copydefault(context, z, z2);
    }

    public final void copydefault(final android.content.Context context, boolean z, final boolean z2) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        pUU.KWHzl("CombinedResourceUpdater", "requestUpdate: requireLocalizationUpdate=" + z + ", requestDynamicResource=" + z2);
        if (z) {
            AbstractC58185ywX<pSD> abstractC58185ywXKWHzl2 = pSC.AEQbTJ.EZpvd(context).KWHzl(yBP.AEQbTJ());
            final Function1 function1 = new Function1() { // from class: o.slV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45210slW.KWHzl((java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<pSD> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl2.OLrzqt(new InterfaceC58229yxO() { // from class: o.slS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C45210slW.djBIcL(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.slT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45210slW.OLrzqt((pSD) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.slU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C45210slW.AhwBna(function12, obj);
                }
            });
        } else {
            RemoteUpdateStatus remoteUpdateStatus = RemoteUpdateStatus.LATEST;
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new pSD(remoteUpdateStatus, remoteUpdateStatus, null, 4, null));
        }
        final Function1 function13 = new Function1() { // from class: o.slZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45210slW.OLrzqt(z2, (pSD) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.sma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C45210slW.valueOf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl3, new Function1() { // from class: o.smb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45210slW.KWHzl(context, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.slX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45210slW.EZpvd(context, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new MiniAppUpdateError(302, "update language failed", th));
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(pSD psd) {
        Intrinsics.checkNotNullParameter(psd, "");
        if (psd.EZpvd().ordinal() >= RemoteUpdateStatus.LATEST.ordinal()) {
            return AbstractC58185ywX.KWHzl(psd);
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new MiniAppUpdateError(302, "update language failed, " + psd.EZpvd(), null, 4, null));
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(boolean z, pSD psd) {
        Intrinsics.checkNotNullParameter(psd, "");
        MlnUpdateRequest requestMlnHotReloadParams$default = C43125rjQ.getRequestMlnHotReloadParams$default(C43192rke.values, false, true, 1, null);
        C43047rhs c43047rhs = C43047rhs.AEQbTJ;
        return InterfaceC48877udv.Companion.OLrzqt(requestMlnHotReloadParams$default, z ? C48872udq.AEQbTJ.EZpvd() : null, c43047rhs.copydefault(), c43047rhs.AEQbTJ());
    }

    public static final Unit KWHzl(android.content.Context context, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        KWHzl.OLrzqt(context, th instanceof MiniAppUpdateError ? (MiniAppUpdateError) th : new MiniAppUpdateError(303, th));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, MiniAppUpdateError miniAppUpdateError) {
        pUU.AEQbTJ("CombinedResourceUpdater", "onError", miniAppUpdateError);
        C43192rke.values.copydefault(context, (MlnUpdateResp) null, miniAppUpdateError);
        C43047rhs.AEQbTJ.KWHzl(null, null, miniAppUpdateError);
        C48872udq.AEQbTJ.KWHzl(null, miniAppUpdateError);
        new C7841arT(null, 1, 0 == true ? 1 : 0).KWHzl(miniAppUpdateError);
    }

    public final void KWHzl(android.content.Context context, CombinedResourceResponse combinedResourceResponse) {
        C43192rke.values.copydefault(context, combinedResourceResponse.getOklua(), (java.lang.Throwable) null);
        C43047rhs.AEQbTJ.KWHzl(combinedResourceResponse.getMiniapp(), combinedResourceResponse.getPreDownload(), null);
        C48872udq.AEQbTJ.KWHzl(combinedResourceResponse.getFile(), null);
    }

    public static final Unit EZpvd(android.content.Context context, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (responseData.getData() != null) {
                C45210slW c45210slW = KWHzl;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                c45210slW.KWHzl(context, (CombinedResourceResponse) data);
            } else {
                KWHzl.OLrzqt(context, new MiniAppUpdateError(303, "data is null", null, 4, null));
            }
        } else {
            KWHzl.OLrzqt(context, new MiniAppUpdateError(303, responseData.getMsg(), null, 4, null));
        }
        return Unit.INSTANCE;
    }
}
