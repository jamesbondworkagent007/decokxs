package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import com.okinc.tradingbot.impl.share.BotShareUtil$Companion$initShare$1;
import com.okinc.tradingbot.impl.share.BotShareUtil$Companion$initShare$2$1;
import com.okinc.tradingbot.impl.share.BotShareUtil$Companion$share$3;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import o.C53686wqF;
import o.C53696wqP;
import o.C53698wqR;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53698wqR {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.wqR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wqR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.wqR$TaskDescription$Application */
        public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
            public final /* synthetic */ ComponentActivity EZpvd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(CoroutineExceptionHandler.Key key, ComponentActivity componentActivity) {
                super(key);
                this.EZpvd = componentActivity;
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
                ((AbstractActivityC33041mov) this.EZpvd).dismissLoading();
            }
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.wqR$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void share$default(TaskDescription taskDescription, TacticsData tacticsData, ComponentActivity componentActivity, boolean z, java.util.List list, boolean z2, C53780wru c53780wru, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                list = yDY.AhwBna();
            }
            java.util.List list2 = list;
            if ((i & 32) != 0) {
                c53780wru = null;
            }
            taskDescription.KWHzl(tacticsData, componentActivity, z, list2, z2, c53780wru);
        }

        public final void KWHzl(@NotNull final TacticsData tacticsData, @NotNull ComponentActivity componentActivity, boolean z, @NotNull java.util.List<StrategyProfitResponse> list, boolean z2, C53780wru c53780wru) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(componentActivity, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (componentActivity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) componentActivity).showLoading();
                C32866mlf.onEvent$default("trade_strategy_share", (TrackChannel[]) null, new Function1() { // from class: o.wqW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53698wqR.TaskDescription.copydefault(tacticsData, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                copydefault(tacticsData, z);
                wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), Dispatchers.getMain().plus(new Application(CoroutineExceptionHandler.Key, componentActivity)), null, new BotShareUtil$Companion$share$3(tacticsData.getShareData(), tacticsData, componentActivity, list, z, z2, c53780wru, null), 2, null);
            }
        }

        public static final Unit copydefault(TacticsData tacticsData, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("type", tacticsData.getHistory() ? "history" : "pendding", true);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: byte */
        /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: byte */
        /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: byte */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Type inference failed for: r1v26, types: [T, java.lang.Object] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, TacticsData tacticsData, java.util.List<StrategyProfitResponse> list, boolean z, boolean z2, java.lang.String str, boolean z3, C53780wru c53780wru, Continuation<? super Unit> continuation) throws java.lang.Throwable {
            BotShareUtil$Companion$initShare$1 botShareUtil$Companion$initShare$1;
            java.util.List arrayList;
            ShareData shareData;
            Ref.ObjectRef objectRef;
            AbstractActivityC33041mov abstractActivityC33041mov2;
            TacticsData tacticsData2;
            java.util.List<StrategyProfitResponse> list2;
            C53780wru c53780wru2;
            boolean z4;
            boolean z5;
            int i;
            Ref.ObjectRef objectRef2;
            java.util.List list3;
            java.lang.String str2;
            boolean z6;
            int i2;
            java.lang.String str3;
            boolean z7;
            int i3;
            int i4;
            boolean z8;
            User userOLrzqt;
            boolean z9;
            byte b;
            boolean z10;
            AbstractActivityC33041mov abstractActivityC33041mov3;
            java.util.List list4;
            InterfaceC48892ueJ interfaceC48892ueJOLrzqt;
            if (continuation instanceof BotShareUtil$Companion$initShare$1) {
                botShareUtil$Companion$initShare$1 = (BotShareUtil$Companion$initShare$1) continuation;
                int i5 = botShareUtil$Companion$initShare$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    botShareUtil$Companion$initShare$1.label = i5 - Integer.MIN_VALUE;
                } else {
                    botShareUtil$Companion$initShare$1 = new BotShareUtil$Companion$initShare$1(this, continuation);
                }
            }
            java.lang.Object obj = botShareUtil$Companion$initShare$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i6 = botShareUtil$Companion$initShare$1.label;
            if (i6 == 0) {
                C56391yDq.AEQbTJ(obj);
                int i7 = !C56071xvr.gEmmrt.ejfBZ() ? 1 : 0;
                arrayList = new java.util.ArrayList();
                int i8 = !list.isEmpty() ? 1 : 0;
                shareData = tacticsData.getShareData();
                objectRef = new Ref.ObjectRef();
                if (z2) {
                    C53666wpm c53666wpmCopydefault = C53666wpm.Companion.copydefault();
                    java.lang.String algoId = tacticsData.getAlgoId();
                    abstractActivityC33041mov2 = abstractActivityC33041mov;
                    botShareUtil$Companion$initShare$1.L$0 = abstractActivityC33041mov2;
                    tacticsData2 = tacticsData;
                    botShareUtil$Companion$initShare$1.L$1 = tacticsData2;
                    list2 = list;
                    botShareUtil$Companion$initShare$1.L$2 = list2;
                    str3 = str;
                    botShareUtil$Companion$initShare$1.L$3 = str3;
                    c53780wru2 = c53780wru;
                    botShareUtil$Companion$initShare$1.L$4 = c53780wru2;
                    botShareUtil$Companion$initShare$1.L$5 = arrayList;
                    botShareUtil$Companion$initShare$1.L$6 = shareData;
                    botShareUtil$Companion$initShare$1.L$7 = objectRef;
                    botShareUtil$Companion$initShare$1.Z$0 = z;
                    botShareUtil$Companion$initShare$1.Z$1 = z2;
                    botShareUtil$Companion$initShare$1.Z$2 = z3;
                    botShareUtil$Companion$initShare$1.I$0 = i7;
                    botShareUtil$Companion$initShare$1.I$1 = i8;
                    botShareUtil$Companion$initShare$1.label = 1;
                    java.lang.Object objKWHzl = c53666wpmCopydefault.KWHzl(algoId, botShareUtil$Companion$initShare$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    z7 = z2;
                    i3 = i7;
                    z5 = z;
                    obj = objKWHzl;
                    i4 = i8;
                    z8 = z3;
                } else {
                    abstractActivityC33041mov2 = abstractActivityC33041mov;
                    tacticsData2 = tacticsData;
                    list2 = list;
                    c53780wru2 = c53780wru;
                    z4 = z2;
                    z5 = z;
                    i = i8;
                    objectRef2 = objectRef;
                    list3 = arrayList;
                    str2 = str;
                    z6 = z3;
                    i2 = i7;
                    ShareData shareData2 = shareData;
                    C53780wru c53780wru3 = c53780wru2;
                    boolean fieldNames = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
                    userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
                    if (userOLrzqt == null) {
                        z9 = true;
                        if (userOLrzqt.isVip()) {
                            b = true;
                        }
                        if (z5 && fieldNames && b == true) {
                            if (i != 0) {
                                z10 = z9;
                                abstractActivityC33041mov3 = abstractActivityC33041mov2;
                                list4 = list3;
                                list4.add(copydefault(tacticsData2, shareData2, str2, z6, i2 != 0 ? z9 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53686wqF.class), true));
                            } else {
                                z10 = z9;
                                abstractActivityC33041mov3 = abstractActivityC33041mov2;
                                list4 = list3;
                            }
                            list4.add(copydefault(tacticsData2, shareData2, str2, z6, i2 != 0 ? z10 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53696wqP.class), true));
                        } else {
                            z10 = z9;
                            abstractActivityC33041mov3 = abstractActivityC33041mov2;
                            list4 = list3;
                        }
                        if (i != 0) {
                            C53686wqF.ActionBar actionBar = C53686wqF.Companion;
                            actionBar.KWHzl(tacticsData2);
                            actionBar.AEQbTJ(list2);
                            actionBar.OLrzqt(c53780wru3);
                            list4.add(copydefault(tacticsData2, shareData2, str2, z6, i2 != 0 ? z10 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53686wqF.class), false));
                        }
                        C53696wqP.TaskDescription taskDescription = C53696wqP.Companion;
                        taskDescription.OLrzqt(c53780wru3);
                        taskDescription.EZpvd(tacticsData2);
                        list4.add(copydefault(tacticsData2, shareData2, str2, z6, i2 != 0 ? z10 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53696wqP.class), false));
                        abstractActivityC33041mov3.dismissLoading();
                        interfaceC48892ueJOLrzqt = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(abstractActivityC33041mov3, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, list4, false, 0.0f, false, null, null, 62, null));
                        if (interfaceC48892ueJOLrzqt != null) {
                            if (z6) {
                                wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(interfaceC48892ueJOLrzqt.EZpvd()), null, null, new BotShareUtil$Companion$initShare$2$1(interfaceC48892ueJOLrzqt, null), 3, null);
                            }
                            interfaceC48892ueJOLrzqt.EZpvd(new Function1() { // from class: o.wqX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return C53698wqR.TaskDescription.EZpvd(((java.lang.Boolean) obj2).booleanValue());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                    z9 = true;
                    b = false;
                    if (z5) {
                        z10 = z9;
                        abstractActivityC33041mov3 = abstractActivityC33041mov2;
                        list4 = list3;
                    }
                    if (i != 0) {
                    }
                    C53696wqP.TaskDescription taskDescription2 = C53696wqP.Companion;
                    taskDescription2.OLrzqt(c53780wru3);
                    taskDescription2.EZpvd(tacticsData2);
                    list4.add(copydefault(tacticsData2, shareData2, str2, z6, i2 != 0 ? z10 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53696wqP.class), false));
                    abstractActivityC33041mov3.dismissLoading();
                    interfaceC48892ueJOLrzqt = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(abstractActivityC33041mov3, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, list4, false, 0.0f, false, null, null, 62, null));
                    if (interfaceC48892ueJOLrzqt != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = botShareUtil$Companion$initShare$1.I$1;
                i3 = botShareUtil$Companion$initShare$1.I$0;
                z8 = botShareUtil$Companion$initShare$1.Z$2;
                z7 = botShareUtil$Companion$initShare$1.Z$1;
                z5 = botShareUtil$Companion$initShare$1.Z$0;
                objectRef = (Ref.ObjectRef) botShareUtil$Companion$initShare$1.L$7;
                shareData = (ShareData) botShareUtil$Companion$initShare$1.L$6;
                arrayList = (java.util.List) botShareUtil$Companion$initShare$1.L$5;
                C53780wru c53780wru4 = (C53780wru) botShareUtil$Companion$initShare$1.L$4;
                java.lang.String str4 = (java.lang.String) botShareUtil$Companion$initShare$1.L$3;
                list2 = (java.util.List) botShareUtil$Companion$initShare$1.L$2;
                TacticsData tacticsData3 = (TacticsData) botShareUtil$Companion$initShare$1.L$1;
                AbstractActivityC33041mov abstractActivityC33041mov4 = (AbstractActivityC33041mov) botShareUtil$Companion$initShare$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c53780wru2 = c53780wru4;
                abstractActivityC33041mov2 = abstractActivityC33041mov4;
                str3 = str4;
                tacticsData2 = tacticsData3;
            }
            objectRef.element = C53669wpp.Companion.KWHzl().AEQbTJ((BotDto) obj);
            i = i4;
            z4 = z7;
            objectRef2 = objectRef;
            list3 = arrayList;
            str2 = str3;
            i2 = i3;
            z6 = z8;
            ShareData shareData22 = shareData;
            C53780wru c53780wru32 = c53780wru2;
            boolean fieldNames2 = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
            userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
            if (userOLrzqt == null) {
            }
            b = false;
            if (z5) {
            }
            if (i != 0) {
            }
            C53696wqP.TaskDescription taskDescription22 = C53696wqP.Companion;
            taskDescription22.OLrzqt(c53780wru32);
            taskDescription22.EZpvd(tacticsData2);
            list4.add(copydefault(tacticsData2, shareData22, str2, z6, i2 != 0 ? z10 : false, objectRef2, z4, C56524yIo.AEQbTJ(C53696wqP.class), false));
            abstractActivityC33041mov3.dismissLoading();
            interfaceC48892ueJOLrzqt = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(abstractActivityC33041mov3, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, list4, false, 0.0f, false, null, null, 62, null));
            if (interfaceC48892ueJOLrzqt != null) {
            }
            return Unit.INSTANCE;
        }

        public static final <T extends AbstractC48902ueT<ImageCustomPreviewConfig>> ShareConfig copydefault(TacticsData tacticsData, ShareData shareData, java.lang.String str, boolean z, boolean z2, Ref.ObjectRef<PlanetBotMetadata> objectRef, boolean z3, InterfaceC56551yJo<T> interfaceC56551yJo, boolean z4) {
            java.lang.String strAYXKKw;
            tWM twm;
            PlanetShareConfig planetShareConfigKWHzl;
            if (tacticsData.getHistory()) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.hwkNQP);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QfgJNx);
            }
            java.lang.String str2 = strAYXKKw;
            java.lang.String strAEQbTJ = C53698wqR.Companion.AEQbTJ(tacticsData.getDeeplink());
            if (strAEQbTJ.length() == 0) {
                strAEQbTJ = shareData.getQrCode();
            }
            IMMessageShareModel iMMessageShareModel = new IMMessageShareModel((java.lang.String) null, (java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, strAEQbTJ, shareData.getQrCode(), C33070mpX.AYXKKw(C55688xof.Application.QfsBiF), IMMessageShareModel.CTAType.TradeNow, (java.util.Map) null, "oktrade_bot", 539, (DefaultConstructorMarker) null);
            ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, null, null, null, 6, null);
            imageShareParamsCreate$default.setShareFrom("property_finalratio_poster");
            java.lang.String qrCode = str == null ? "" : str;
            if (qrCode.length() == 0 && (qrCode = shareData.getQrCode()) == null) {
                qrCode = "";
            }
            imageShareParamsCreate$default.setBody(qrCode);
            android.os.Bundle extras = imageShareParamsCreate$default.getExtras();
            extras.putBoolean("isEnableIMShare", z2);
            extras.putParcelable("imMessageShare", iMMessageShareModel);
            extras.putBoolean("BOT_SHARE_VIP_KEY", z4);
            PlanetBotMetadata planetBotMetadata = objectRef.element;
            if (z3 && planetBotMetadata != null && (twm = (tWM) C43251rlk.OLrzqt(tWM.class)) != null && (planetShareConfigKWHzl = twm.KWHzl(PlanetPublisherPluginType.BOTS, "", planetBotMetadata.AYXKKw())) != null) {
                extras.putParcelable("planetShare", planetShareConfigKWHzl);
            }
            if (z) {
                C48903ueU.AEQbTJ(imageShareParamsCreate$default);
            }
            ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, imageShareParamsCreate$default, null, 2, null);
            ImageCustomPreviewConfig imageCustomPreviewConfigCreate$default = ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, yHE.OLrzqt(interfaceC56551yJo), null, null, 6, null);
            imageCustomPreviewConfigCreate$default.setPreviewBottomTips("");
            imageCustomPreviewConfigCreate$default.setEditable(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) shareData.getAltDataValue()));
            shareConfigCreate$default.setPreviewConfig(imageCustomPreviewConfigCreate$default);
            return shareConfigCreate$default;
        }

        public static final Unit EZpvd(boolean z) {
            return Unit.INSTANCE;
        }

        public final java.lang.String AEQbTJ(java.lang.String str) {
            java.lang.String str2 = C34703nhO.AEQbTJ() ? "OKTR" : "OKX";
            Regex regex = new Regex(str2);
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return regex.replaceFirst(str, lowerCase);
        }

        public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, final Function1<? super java.lang.String, Unit> function1) {
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AEQbTJ(str, new C48891ueI("property_finalratio_poster", str2, true, RedirectBehavior.DEFAULT_ALLOW_DEEPLINK, null, 16, null)), abstractActivityC33041mov);
            final Function1 function12 = new Function1() { // from class: o.wra
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53698wqR.TaskDescription.OLrzqt(function1, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.wqZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C53698wqR.TaskDescription.OLrzqt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.wqY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53698wqR.TaskDescription.EZpvd(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.wrb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C53698wqR.TaskDescription.AEQbTJ(function13, obj);
                }
            });
        }

        public static final Unit OLrzqt(Function1 function1, C48887ueE c48887ueE) {
            function1.invoke(c48887ueE != null ? c48887ueE.OLrzqt() : null);
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }

        public final void copydefault(TacticsData tacticsData, boolean z) {
            C55697xoo c55697xoo = C55697xoo.OLrzqt;
            UserProfile userProfileFetchVPNInfo = c55697xoo.fetchVPNInfo();
            if (!z || userProfileFetchVPNInfo == null) {
                return;
            }
            if (tacticsData.getShareData().getNickName() == null || tacticsData.getShareData().getAvatar() == null) {
                ShareData shareData = tacticsData.getShareData();
                java.lang.String approvedPetname = userProfileFetchVPNInfo.getApprovedPetname();
                java.lang.String strDbNXlk = c55697xoo.DbNXlk();
                if (approvedPetname == null || approvedPetname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) approvedPetname)) {
                    approvedPetname = strDbNXlk;
                }
                shareData.setNickName(approvedPetname);
                tacticsData.getShareData().setAvatar(userProfileFetchVPNInfo.getProfilePictureUrl());
            }
        }
    }
}
