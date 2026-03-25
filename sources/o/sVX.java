package o;

import com.google.gson.Gson;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.PinnedMessageModel;
import com.okinc.oklive.app.data.model.remote.TokenIcon;
import com.okinc.oklive.app.domain.model.GeneralInsightsMessage;
import com.okinc.oklive.app.domain.model.LiveStreamUpdateMessage;
import com.okinc.oklive.app.domain.model.ModerationMessage;
import com.okinc.oklive.app.domain.model.TokenUpdateMessage;
import com.okinc.oklive.app.domain.model.WSPinMessageModel;
import com.okinc.oklive.app.domain.model.WSUnpinMessageModel;
import com.okinc.oklive.app.ui.list.displaymodel.LiveStreamCustomMessageUpdate;
import com.okinc.oklive.domain.usecase.ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sVX implements InterfaceC44556sUh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final Gson OLrzqt;

    @yCM
    public sVX(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "");
        this.OLrzqt = gson;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sVX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC44556sUh
    public Flow<LiveStreamCustomMessageUpdate> copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return FlowKt.flow(new ProcessLiveStreamCustomMessageUseCase$processCustomMessage$1(oKMessage, this, null));
    }

    public final LiveStreamCustomMessageUpdate OLrzqt(OKCustomMessage oKCustomMessage) {
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "GeneralInsights update: currentViews=" + ((GeneralInsightsMessage) this.OLrzqt.fromJson(content, GeneralInsightsMessage.class)).getCurrentViews());
                return new LiveStreamCustomMessageUpdate.AssistContent(r2.getCurrentViews());
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "GeneralInsights message has no content");
            java.lang.String bizName = oKCustomMessage.getBizName();
            if (bizName == null) {
                bizName = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing GeneralInsights message", e);
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2 != null ? bizName2 : "", oKCustomMessage.getContent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LiveStreamCustomMessageUpdate gEmmrt(OKCustomMessage oKCustomMessage) {
        java.lang.String str = "";
        try {
            java.lang.String content = oKCustomMessage.getContent();
            java.util.ArrayList arrayList = null;
            try {
                if (content != null) {
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                        try {
                            TokenUpdateMessage tokenUpdateMessage = (TokenUpdateMessage) this.OLrzqt.fromJson(content, TokenUpdateMessage.class);
                            pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "TokenUpdate: tokenType=" + tokenUpdateMessage.getTokenType() + ", tokenSymbol=" + tokenUpdateMessage.getTokenSymbol() + ", tokenName=" + tokenUpdateMessage.getTokenName() + ", cefiToken=" + tokenUpdateMessage.getCefiToken() + ", cedefiToken=" + tokenUpdateMessage.getCedefiToken());
                            int tokenType = tokenUpdateMessage.getTokenType();
                            TokenUpdateMessage.CefiToken cefiToken = tokenUpdateMessage.getCefiToken();
                            LiveStreamCustomMessageUpdate.LoaderManager.ActionBar actionBar = cefiToken != null ? new LiveStreamCustomMessageUpdate.LoaderManager.ActionBar(cefiToken.getInstId(), cefiToken.getInstType()) : null;
                            TokenUpdateMessage.CedefiToken cedefiToken = tokenUpdateMessage.getCedefiToken();
                            LiveStreamCustomMessageUpdate.LoaderManager.Application application = cedefiToken != null ? new LiveStreamCustomMessageUpdate.LoaderManager.Application(cedefiToken.getChainId(), cedefiToken.getContractAddress()) : null;
                            java.lang.String tokenName = tokenUpdateMessage.getTokenName();
                            java.lang.String tokenSymbol = tokenUpdateMessage.getTokenSymbol();
                            java.lang.Boolean boolIsDexListed = tokenUpdateMessage.isDexListed();
                            java.lang.String tokenLogo = tokenUpdateMessage.getTokenLogo();
                            java.lang.String chainLogo = tokenUpdateMessage.getChainLogo();
                            java.util.List<TokenUpdateMessage.TokenIconData> icons = tokenUpdateMessage.getIcons();
                            if (icons != null) {
                                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(icons, 10));
                                for (TokenUpdateMessage.TokenIconData tokenIconData : icons) {
                                    java.lang.String str2 = str;
                                    arrayList.add(new TokenIcon(tokenIconData.getLight(), tokenIconData.getDark()));
                                    str = str2;
                                }
                            }
                            return new LiveStreamCustomMessageUpdate.FragmentManager(tokenType, actionBar, application, tokenName, tokenSymbol, boolIsDexListed, tokenLogo, chainLogo, arrayList, tokenUpdateMessage.getCurrentPrice(), tokenUpdateMessage.getChange1h(), tokenUpdateMessage.getMarketCap());
                        } catch (java.lang.Exception e) {
                            e = e;
                            java.lang.String str3 = str;
                            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing TokenUpdate message", e);
                            java.lang.String bizName = oKCustomMessage.getBizName();
                            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName != null ? str3 : bizName, oKCustomMessage.getContent());
                        }
                    }
                }
                pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "TokenUpdate message has no content");
                java.lang.String bizName2 = oKCustomMessage.getBizName();
                if (bizName2 == null) {
                    bizName2 = "";
                }
                return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2, null);
            } catch (java.lang.Exception e2) {
                e = e2;
                pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing TokenUpdate message", e);
                java.lang.String bizName3 = oKCustomMessage.getBizName();
                return new LiveStreamCustomMessageUpdate.TaskDescription(bizName3 != null ? str3 : bizName3, oKCustomMessage.getContent());
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    public final LiveStreamCustomMessageUpdate AEQbTJ(OKCustomMessage oKCustomMessage) {
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                LiveStreamUpdateMessage liveStreamUpdateMessage = (LiveStreamUpdateMessage) this.OLrzqt.fromJson(content, LiveStreamUpdateMessage.class);
                LiveStreamStatus status = liveStreamUpdateMessage.getStatus();
                if (status == LiveStreamStatus.UNKNOWN) {
                    pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "Unknown status code: " + liveStreamUpdateMessage.getStatusCode());
                    java.lang.String bizName = oKCustomMessage.getBizName();
                    if (bizName == null) {
                        bizName = "";
                    }
                    return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, content);
                }
                return new LiveStreamCustomMessageUpdate.Application(status);
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "LiveStreamUpdate message has no content");
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            if (bizName2 == null) {
                bizName2 = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing LiveStreamUpdate message", e);
            java.lang.String bizName3 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName3 != null ? bizName3 : "", oKCustomMessage.getContent());
        }
    }

    public final LiveStreamCustomMessageUpdate copydefault(OKCustomMessage oKCustomMessage) {
        return OLrzqt(oKCustomMessage, new Function1() { // from class: o.sVW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sVX.AEQbTJ((LiveStreamCustomMessageUpdate.Fragment) obj);
            }
        });
    }

    public static final LiveStreamCustomMessageUpdate AEQbTJ(LiveStreamCustomMessageUpdate.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "ModeratorAssign: User " + fragment.copydefault() + " (uid=" + fragment.AEQbTJ() + ") assigned as moderator");
        return new LiveStreamCustomMessageUpdate.StateListAnimator(fragment);
    }

    public final LiveStreamCustomMessageUpdate EZpvd(OKCustomMessage oKCustomMessage) {
        return OLrzqt(oKCustomMessage, new Function1() { // from class: o.sVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sVX.copydefault((LiveStreamCustomMessageUpdate.Fragment) obj);
            }
        });
    }

    public static final LiveStreamCustomMessageUpdate copydefault(LiveStreamCustomMessageUpdate.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "ModeratorRevoke: User " + fragment.copydefault() + " (uid=" + fragment.AEQbTJ() + ") revoked as moderator");
        return new LiveStreamCustomMessageUpdate.Activity(fragment);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:3:0x0004, B:5:0x000a, B:8:0x0011, B:10:0x0025, B:13:0x0033, B:20:0x0053, B:22:0x0059, B:23:0x005d, B:16:0x0049, B:12:0x0031, B:24:0x0069, B:27:0x0088), top: B:36:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:3:0x0004, B:5:0x000a, B:8:0x0011, B:10:0x0025, B:13:0x0033, B:20:0x0053, B:22:0x0059, B:23:0x005d, B:16:0x0049, B:12:0x0031, B:24:0x0069, B:27:0x0088), top: B:36:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LiveStreamCustomMessageUpdate OLrzqt(OKCustomMessage oKCustomMessage, Function1<? super LiveStreamCustomMessageUpdate.Fragment, ? extends LiveStreamCustomMessageUpdate> function1) {
        LiveStreamCustomMessageUpdate.UserRole userRoleCopydefault;
        boolean z;
        java.util.List<java.lang.String> tags;
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                ModerationMessage.TargetParticipant targetParticipant = ((ModerationMessage) this.OLrzqt.fromJson(content, ModerationMessage.class)).getTargetParticipant();
                java.lang.Integer role = targetParticipant.getRole();
                if (role != null) {
                    userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.Companion.copydefault(role.intValue());
                    if (userRoleCopydefault == null) {
                        userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.VIEWER;
                    }
                }
                LiveStreamCustomMessageUpdate.UserRole userRole = userRoleCopydefault;
                long userUid = targetParticipant.getUserUid();
                java.lang.String nickname = targetParticipant.getNickname();
                java.lang.String avatar = targetParticipant.getAvatar();
                java.lang.Integer muteStatus = targetParticipant.getMuteStatus();
                if (muteStatus != null) {
                    z = true;
                    if (muteStatus.intValue() == 1) {
                    }
                    tags = targetParticipant.getTags();
                    if (tags == null) {
                        tags = yDY.AhwBna();
                    }
                    return function1.invoke(new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags));
                }
                z = false;
                tags = targetParticipant.getTags();
                if (tags == null) {
                }
                return function1.invoke(new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags));
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", oKCustomMessage.getBizName() + " message has no content");
            java.lang.String bizName = oKCustomMessage.getBizName();
            if (bizName == null) {
                bizName = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing " + oKCustomMessage.getBizName() + " message", e);
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2 != null ? bizName2 : "", oKCustomMessage.getContent());
        }
    }

    public final LiveStreamCustomMessageUpdate KWHzl(OKCustomMessage oKCustomMessage) {
        pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "Handling generic message: serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName() + ", content=" + oKCustomMessage.getContent());
        java.lang.String bizName = oKCustomMessage.getBizName();
        if (bizName == null) {
            bizName = "";
        }
        return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, oKCustomMessage.getContent());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:3:0x0034, B:5:0x003a, B:8:0x0041, B:10:0x0055, B:13:0x0063, B:20:0x0083, B:22:0x0089, B:23:0x008d, B:26:0x0099, B:16:0x0079, B:12:0x0061, B:27:0x009f, B:30:0x00be), top: B:39:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:3:0x0034, B:5:0x003a, B:8:0x0041, B:10:0x0055, B:13:0x0063, B:20:0x0083, B:22:0x0089, B:23:0x008d, B:26:0x0099, B:16:0x0079, B:12:0x0061, B:27:0x009f, B:30:0x00be), top: B:39:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LiveStreamCustomMessageUpdate valueOf(OKCustomMessage oKCustomMessage) {
        LiveStreamCustomMessageUpdate.UserRole userRoleCopydefault;
        boolean z;
        java.util.List<java.lang.String> tags;
        java.lang.String bizName;
        pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "Handling handleMuteUser message: serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName() + ", content=" + oKCustomMessage.getContent());
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                ModerationMessage.TargetParticipant targetParticipant = ((ModerationMessage) this.OLrzqt.fromJson(content, ModerationMessage.class)).getTargetParticipant();
                java.lang.Integer role = targetParticipant.getRole();
                if (role != null) {
                    userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.Companion.copydefault(role.intValue());
                    if (userRoleCopydefault == null) {
                        userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.VIEWER;
                    }
                }
                LiveStreamCustomMessageUpdate.UserRole userRole = userRoleCopydefault;
                long userUid = targetParticipant.getUserUid();
                java.lang.String nickname = targetParticipant.getNickname();
                java.lang.String avatar = targetParticipant.getAvatar();
                java.lang.Integer muteStatus = targetParticipant.getMuteStatus();
                if (muteStatus != null) {
                    z = true;
                    if (muteStatus.intValue() == 1) {
                    }
                    tags = targetParticipant.getTags();
                    if (tags == null) {
                        tags = yDY.AhwBna();
                    }
                    LiveStreamCustomMessageUpdate.Fragment fragment = new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags);
                    bizName = oKCustomMessage.getBizName();
                    if (bizName == null) {
                        bizName = "";
                    }
                    return new LiveStreamCustomMessageUpdate.ActionBar(bizName, fragment);
                }
                z = false;
                tags = targetParticipant.getTags();
                if (tags == null) {
                }
                LiveStreamCustomMessageUpdate.Fragment fragment2 = new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags);
                bizName = oKCustomMessage.getBizName();
                if (bizName == null) {
                }
                return new LiveStreamCustomMessageUpdate.ActionBar(bizName, fragment2);
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", oKCustomMessage.getBizName() + " message has no content");
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            if (bizName2 == null) {
                bizName2 = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing MuteUser/UnmuteUser message", e);
            java.lang.String bizName3 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName3 != null ? bizName3 : "", oKCustomMessage.getContent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:3:0x0034, B:5:0x003a, B:8:0x0041, B:10:0x0055, B:13:0x0063, B:20:0x0083, B:22:0x0089, B:23:0x008d, B:26:0x0099, B:16:0x0079, B:12:0x0061, B:27:0x009f, B:30:0x00be), top: B:39:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:3:0x0034, B:5:0x003a, B:8:0x0041, B:10:0x0055, B:13:0x0063, B:20:0x0083, B:22:0x0089, B:23:0x008d, B:26:0x0099, B:16:0x0079, B:12:0x0061, B:27:0x009f, B:30:0x00be), top: B:39:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LiveStreamCustomMessageUpdate AYXKKw(OKCustomMessage oKCustomMessage) {
        LiveStreamCustomMessageUpdate.UserRole userRoleCopydefault;
        boolean z;
        java.util.List<java.lang.String> tags;
        java.lang.String bizName;
        pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "Handling handleRemoveViewer message: serviceName=" + oKCustomMessage.getServiceName() + ", bizName=" + oKCustomMessage.getBizName() + ", content=" + oKCustomMessage.getContent());
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                ModerationMessage.TargetParticipant targetParticipant = ((ModerationMessage) this.OLrzqt.fromJson(content, ModerationMessage.class)).getTargetParticipant();
                java.lang.Integer role = targetParticipant.getRole();
                if (role != null) {
                    userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.Companion.copydefault(role.intValue());
                    if (userRoleCopydefault == null) {
                        userRoleCopydefault = LiveStreamCustomMessageUpdate.UserRole.VIEWER;
                    }
                }
                LiveStreamCustomMessageUpdate.UserRole userRole = userRoleCopydefault;
                long userUid = targetParticipant.getUserUid();
                java.lang.String nickname = targetParticipant.getNickname();
                java.lang.String avatar = targetParticipant.getAvatar();
                java.lang.Integer muteStatus = targetParticipant.getMuteStatus();
                if (muteStatus != null) {
                    z = true;
                    if (muteStatus.intValue() == 1) {
                    }
                    tags = targetParticipant.getTags();
                    if (tags == null) {
                        tags = yDY.AhwBna();
                    }
                    LiveStreamCustomMessageUpdate.Fragment fragment = new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags);
                    bizName = oKCustomMessage.getBizName();
                    if (bizName == null) {
                        bizName = "";
                    }
                    return new LiveStreamCustomMessageUpdate.PendingIntent(bizName, fragment);
                }
                z = false;
                tags = targetParticipant.getTags();
                if (tags == null) {
                }
                LiveStreamCustomMessageUpdate.Fragment fragment2 = new LiveStreamCustomMessageUpdate.Fragment(userUid, nickname, avatar, userRole, z, tags);
                bizName = oKCustomMessage.getBizName();
                if (bizName == null) {
                }
                return new LiveStreamCustomMessageUpdate.PendingIntent(bizName, fragment2);
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", oKCustomMessage.getBizName() + " message has no content");
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            if (bizName2 == null) {
                bizName2 = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing MuteUser/UnmuteUser message", e);
            java.lang.String bizName3 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName3 != null ? bizName3 : "", oKCustomMessage.getContent());
        }
    }

    public final LiveStreamCustomMessageUpdate AhwBna(OKCustomMessage oKCustomMessage) {
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                WSPinMessageModel wSPinMessageModel = (WSPinMessageModel) this.OLrzqt.fromJson(content, WSPinMessageModel.class);
                PinnedMessageModel message = wSPinMessageModel.getMessage();
                java.lang.String seq = message != null ? message.getSeq() : null;
                pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "PinMessage: messageSeq=" + seq + ", message=" + wSPinMessageModel.getMessage());
                PinnedMessageModel message2 = wSPinMessageModel.getMessage();
                return new LiveStreamCustomMessageUpdate.Dialog(C33129mqd.valueOf(message2 != null ? message2.getSeq() : null), wSPinMessageModel.getMessage());
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "PinMessage message has no content");
            java.lang.String bizName = oKCustomMessage.getBizName();
            if (bizName == null) {
                bizName = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing PinMessage message", e);
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2 != null ? bizName2 : "", oKCustomMessage.getContent());
        }
    }

    public final LiveStreamCustomMessageUpdate djBIcL(OKCustomMessage oKCustomMessage) {
        try {
            java.lang.String content = oKCustomMessage.getContent();
            if (content != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                WSUnpinMessageModel wSUnpinMessageModel = (WSUnpinMessageModel) this.OLrzqt.fromJson(content, WSUnpinMessageModel.class);
                pUU.EZpvd("ProcessLiveStreamCustomMessageUseCase", "UnpinMessage: messageSeq=" + wSUnpinMessageModel.getMessageSeq());
                return new LiveStreamCustomMessageUpdate.SharedElementCallback(wSUnpinMessageModel.getMessageSeq());
            }
            pUU.valueOf("ProcessLiveStreamCustomMessageUseCase", "UnpinMessage message has no content");
            java.lang.String bizName = oKCustomMessage.getBizName();
            if (bizName == null) {
                bizName = "";
            }
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ProcessLiveStreamCustomMessageUseCase", "Error parsing UnpinMessage message", e);
            java.lang.String bizName2 = oKCustomMessage.getBizName();
            return new LiveStreamCustomMessageUpdate.TaskDescription(bizName2 != null ? bizName2 : "", oKCustomMessage.getContent());
        }
    }
}
