package com.reown.sign.client;

import com.reown.sign.client.Sign;
import com.reown.sign.client.SignInterface;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignClient implements SignInterface {
    public static final SignClient INSTANCE = new SignClient();
    public final /* synthetic */ SignProtocol $$delegate_0 = SignProtocol.Companion.getInstance();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void approveAuthenticate(@NotNull Sign.Params.ApproveAuthenticate approveAuthenticate, @NotNull Function1<? super Sign.Params.ApproveAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(approveAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.approveAuthenticate(approveAuthenticate, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void approveSession(@NotNull Sign.Params.Approve approve, @NotNull Function1<? super Sign.Params.Approve, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(approve, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.approveSession(approve, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void authenticate(@NotNull Sign.Params.Authenticate authenticate, String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(authenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.authenticate(authenticate, str, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void connect(@NotNull Sign.Params.Connect connect, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(connect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.connect(connect, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void decryptMessage(@NotNull Sign.Params.DecryptMessage decryptMessage, @NotNull Function1<? super Sign.Model.Message, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(decryptMessage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.decryptMessage(decryptMessage, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void disconnect(@NotNull Sign.Params.Disconnect disconnect, @NotNull Function1<? super Sign.Params.Disconnect, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(disconnect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.disconnect(disconnect, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void dispatchEnvelope(@NotNull String str, @NotNull Function1<? super Sign.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.$$delegate_0.dispatchEnvelope(str, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void emit(@NotNull Sign.Params.Emit emit, @NotNull Function1<? super Sign.Params.Emit, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(emit, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.emit(emit, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void extend(@NotNull Sign.Params.Extend extend, @NotNull Function1<? super Sign.Params.Extend, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(extend, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.extend(extend, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public String formatAuthMessage(@NotNull Sign.Params.FormatMessage formatMessage) {
        Intrinsics.checkNotNullParameter(formatMessage, "");
        return this.$$delegate_0.formatAuthMessage(formatMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public Sign.Model.Session getActiveSessionByTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.getActiveSessionByTopic(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.Session> getListOfActiveSessions() {
        return this.$$delegate_0.getListOfActiveSessions();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.VerifyContext> getListOfVerifyContexts() {
        return this.$$delegate_0.getListOfVerifyContexts();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionAuthenticate> getPendingAuthenticateRequests() {
        return this.$$delegate_0.getPendingAuthenticateRequests();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionRequest> getPendingSessionRequests(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.$$delegate_0.getPendingSessionRequests(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public List<Sign.Model.SessionProposal> getSessionProposals() {
        return this.$$delegate_0.getSessionProposals();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public Sign.Model.VerifyContext getVerifyContext(long j) {
        return this.$$delegate_0.getVerifyContext(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void initialize(@NotNull Sign.Params.Init init, @NotNull Function0<Unit> function0, @NotNull Function1<? super Sign.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(init, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.$$delegate_0.initialize(init, function0, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void ping(@NotNull Sign.Params.Ping ping, Sign.Listeners.SessionPing sessionPing) {
        Intrinsics.checkNotNullParameter(ping, "");
        this.$$delegate_0.ping(ping, sessionPing);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void rejectAuthenticate(@NotNull Sign.Params.RejectAuthenticate rejectAuthenticate, @NotNull Function1<? super Sign.Params.RejectAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(rejectAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.rejectAuthenticate(rejectAuthenticate, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void rejectSession(@NotNull Sign.Params.Reject reject, @NotNull Function1<? super Sign.Params.Reject, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(reject, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.rejectSession(reject, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void request(@NotNull Sign.Params.Request request, @NotNull Function1<? super Sign.Model.SentRequest, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.request(request, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void respond(@NotNull Sign.Params.Response response, @NotNull Function1<? super Sign.Params.Response, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.respond(response, function1, function12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void setDappDelegate(@NotNull SignInterface.DappDelegate dappDelegate) {
        Intrinsics.checkNotNullParameter(dappDelegate, "");
        this.$$delegate_0.setDappDelegate(dappDelegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void setWalletDelegate(@NotNull SignInterface.WalletDelegate walletDelegate) {
        Intrinsics.checkNotNullParameter(walletDelegate, "");
        this.$$delegate_0.setWalletDelegate(walletDelegate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.client.SignInterface
    public void update(@NotNull Sign.Params.Update update, @NotNull Function1<? super Sign.Params.Update, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12) {
        Intrinsics.checkNotNullParameter(update, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.$$delegate_0.update(update, function1, function12);
    }

    public interface WalletDelegate extends SignInterface.WalletDelegate {

        /* JADX INFO: loaded from: classes17.dex */
        public static final class DefaultImpls {
            public static Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit> getOnSessionAuthenticate(@NotNull WalletDelegate walletDelegate) {
                return SignInterface.WalletDelegate.DefaultImpls.getOnSessionAuthenticate(walletDelegate);
            }

            public static void onProposalExpired(@NotNull WalletDelegate walletDelegate, @NotNull Sign.Model.ExpiredProposal expiredProposal) {
                Intrinsics.checkNotNullParameter(expiredProposal, "");
                SignInterface.WalletDelegate.DefaultImpls.onProposalExpired(walletDelegate, expiredProposal);
            }

            public static void onRequestExpired(@NotNull WalletDelegate walletDelegate, @NotNull Sign.Model.ExpiredRequest expiredRequest) {
                Intrinsics.checkNotNullParameter(expiredRequest, "");
                SignInterface.WalletDelegate.DefaultImpls.onRequestExpired(walletDelegate, expiredRequest);
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface DappDelegate extends SignInterface.DappDelegate {

        /* JADX INFO: loaded from: classes24.dex */
        public static final class DefaultImpls {
            public static void onSessionAuthenticateResponse(@NotNull DappDelegate dappDelegate, @NotNull Sign.Model.SessionAuthenticateResponse sessionAuthenticateResponse) {
                Intrinsics.checkNotNullParameter(sessionAuthenticateResponse, "");
                SignInterface.DappDelegate.DefaultImpls.onSessionAuthenticateResponse(dappDelegate, sessionAuthenticateResponse);
            }

            public static void onSessionEvent(@NotNull DappDelegate dappDelegate, @NotNull Sign.Model.Event event) {
                Intrinsics.checkNotNullParameter(event, "");
                SignInterface.DappDelegate.DefaultImpls.onSessionEvent(dappDelegate, event);
            }
        }
    }
}
