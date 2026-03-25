package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C15937eaV;
import o.C16013ebs;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$onRequestAccounts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WalletEvent.ConnectSuccess.Payload.Response>, Object> {
    final /* synthetic */ C15937eaV $connectAndSignData;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ DAppConnectRequest.Request.RequestAccounts $requestAccounts;
    final /* synthetic */ WalletEvent.ConnectSuccess.Payload.Response $tonAddrResponse;
    final /* synthetic */ WalletEvent.ConnectSuccess.Payload.Response $tonProofResponse;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$onRequestAccounts$2(DAppConnectRequest.Request.RequestAccounts requestAccounts, AbstractC12782ctV abstractC12782ctV, C16013ebs c16013ebs, WalletEvent.ConnectSuccess.Payload.Response response, WalletEvent.ConnectSuccess.Payload.Response response2, C15937eaV c15937eaV, DAppInfo dAppInfo, Continuation<? super DAppConnectRequestHelper$onRequestAccounts$2> continuation) {
        super(2, continuation);
        this.$requestAccounts = requestAccounts;
        this.$wallet = abstractC12782ctV;
        this.this$0 = c16013ebs;
        this.$tonAddrResponse = response;
        this.$tonProofResponse = response2;
        this.$connectAndSignData = c15937eaV;
        this.$dAppInfo = dAppInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$onRequestAccounts$2(this.$requestAccounts, this.$wallet, this.this$0, this.$tonAddrResponse, this.$tonProofResponse, this.$connectAndSignData, this.$dAppInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WalletEvent.ConnectSuccess.Payload.Response> continuation) {
        return ((DAppConnectRequestHelper$onRequestAccounts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [980=13] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:451:0x11ab
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r76) {
        /*
            r75 = this;
            r11 = r75
            java.lang.Object r12 = o.C56437yFi.OLrzqt()
            int r1 = r11.label
            java.lang.String r2 = "Failed to handle the request - "
            java.lang.String r10 = ""
            java.lang.String r3 = "DAppConnectRequestHelper"
            switch(r1) {
                case 0: goto L45b;
                case 1: goto L409;
                case 2: goto L3ba;
                case 3: goto L36d;
                case 4: goto L321;
                case 5: goto L2d9;
                case 6: goto L293;
                case 7: goto L249;
                case 8: goto L1fd;
                case 9: goto L198;
                case 10: goto L14e;
                case 11: goto L101;
                case 12: goto Lb5;
                case 13: goto L6a;
                case 14: goto L19;
                default: goto L11;
            }
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.Object r1 = r11.L$12
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$11
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r5 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r5
            java.lang.Object r6 = r11.L$9
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.L$8
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r8
            java.lang.Object r9 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r9 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r9
            java.lang.Object r14 = r11.L$5
            o.ctV r14 = (o.AbstractC12782ctV) r14
            java.lang.Object r15 = r11.L$4
            o.ebs r15 = (o.C16013ebs) r15
            java.lang.Object r13 = r11.L$3
            o.eaV r13 = (o.C15937eaV) r13
            r17 = r1
            java.lang.Object r1 = r11.L$2
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r19 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r23 = r2
            r26 = r10
            r2 = r18
            r10 = r7
            r7 = r8
            r8 = r6
            r6 = r9
            r9 = r3
            r3 = r13
            r13 = r12
            r12 = r1
            r1 = r17
            r17 = r26
            goto L173f
        L6a:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r26 = r10
            r72 = r15
            r15 = r1
            r1 = r18
            r18 = r13
            r13 = r12
            goto L1541
        Lb5:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r26 = r10
            r27 = r13
            r28 = r17
            r13 = r12
            r12 = r15
            r15 = r1
            r1 = r18
            goto L162c
        L101:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r10 = r12
            r12 = r32
            r73 = r15
            r15 = r1
            r1 = r18
            r18 = r73
            goto L907
        L14e:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r33 = r14
            r14 = r18
            r10 = r12
            r12 = r32
            goto La31
        L198:
            java.lang.Object r1 = r11.L$14
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$13
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest) r4
            java.lang.Object r5 = r11.L$12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r11.L$11
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r7
            java.lang.Object r8 = r11.L$9
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r11.L$8
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r13 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r13 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r13
            java.lang.Object r14 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r14 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r14
            java.lang.Object r15 = r11.L$5
            o.ctV r15 = (o.AbstractC12782ctV) r15
            r17 = r1
            java.lang.Object r1 = r11.L$4
            o.ebs r1 = (o.C16013ebs) r1
            r18 = r1
            java.lang.Object r1 = r11.L$3
            o.eaV r1 = (o.C15937eaV) r1
            r19 = r1
            java.lang.Object r1 = r11.L$2
            java.util.List r1 = (java.util.List) r1
            r20 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r21 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r22 = r76
            kotlin.Result r22 = (kotlin.Result) r22     // Catch: java.lang.Exception -> L455
            java.lang.Object r22 = r22.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r5
            r28 = r6
            r5 = r10
            r26 = r5
            r10 = r12
            r56 = r13
            r12 = r15
            r13 = r20
            r20 = r21
            r15 = r1
            r1 = r18
            goto L10c6
        L1fd:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r26 = r10
            r61 = r17
            r60 = r18
            r73 = r13
            r13 = r12
            r12 = r73
            goto L12d2
        L249:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r40 = r14
            r14 = r12
            r12 = r15
            r15 = r1
            r1 = r17
            goto Lb7a
        L293:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r45 = r14
            r14 = r12
            goto Lc93
        L2d9:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r26 = r10
            r73 = r13
            r13 = r12
            r12 = r73
            goto L1422
        L321:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r49 = r8
            r32 = r10
            r8 = r12
            r12 = r15
            r47 = r17
            r15 = r1
            r1 = r18
            goto Le4a
        L36d:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r10 = r12
            r12 = r32
            r73 = r15
            r15 = r1
            r1 = r18
            r18 = r73
            goto Lf34
        L3ba:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r32 = r10
            r73 = r15
            r15 = r1
            r1 = r18
            r18 = r73
            r74 = r14
            r14 = r12
            r12 = r74
            goto Ld7d
        L409:
            java.lang.Object r1 = r11.L$11
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r11.L$10
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r4
            java.lang.Object r5 = r11.L$9
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r11.L$8
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r11.L$7
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo) r7
            java.lang.Object r8 = r11.L$6
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r8 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts) r8
            java.lang.Object r9 = r11.L$5
            o.ctV r9 = (o.AbstractC12782ctV) r9
            java.lang.Object r13 = r11.L$4
            o.ebs r13 = (o.C16013ebs) r13
            java.lang.Object r14 = r11.L$3
            o.eaV r14 = (o.C15937eaV) r14
            java.lang.Object r15 = r11.L$2
            java.util.List r15 = (java.util.List) r15
            r17 = r1
            java.lang.Object r1 = r11.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            r18 = r1
            java.lang.Object r1 = r11.L$0
            java.util.List r1 = (java.util.List) r1
            o.C56391yDq.AEQbTJ(r76)     // Catch: java.lang.Exception -> L455
            r19 = r76
            kotlin.Result r19 = (kotlin.Result) r19     // Catch: java.lang.Exception -> L455
            java.lang.Object r19 = r19.m7386unboximpl()     // Catch: java.lang.Exception -> L455
            r76 = r1
            r20 = r19
            r19 = r10
            r10 = r14
            r14 = r18
            r18 = r19
            goto L7d5
        L455:
            r0 = move-exception
            r1 = r0
            r24 = r3
            goto L743
        L45b:
            o.C56391yDq.AEQbTJ(r76)
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r1 = r11.$requestAccounts     // Catch: java.lang.Exception -> L1856
            java.util.List r1 = r1.getRequestedNamespaces()     // Catch: java.lang.Exception -> L1856
            o.ebs r4 = r11.this$0     // Catch: java.lang.Exception -> L1856
            o.ctV r5 = r11.$wallet     // Catch: java.lang.Exception -> L1856
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r6 = r11.$requestAccounts     // Catch: java.lang.Exception -> L1856
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response r7 = r11.$tonAddrResponse     // Catch: java.lang.Exception -> L1856
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response r8 = r11.$tonProofResponse     // Catch: java.lang.Exception -> L1856
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1856
            r13 = 10
            int r14 = kotlin.collections.CollectionsKt.copydefault(r1, r13)     // Catch: java.lang.Exception -> L1856
            r9.<init>(r14)     // Catch: java.lang.Exception -> L1856
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L1856
        L47d:
            boolean r13 = r1.hasNext()     // Catch: java.lang.Exception -> L1856
            if (r13 == 0) goto L71b
            java.lang.Object r13 = r1.next()     // Catch: java.lang.Exception -> L716
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$Namespace r13 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.Namespace) r13     // Catch: java.lang.Exception -> L716
            java.util.List r19 = o.C16013ebs.KWHzl(r4, r13, r5)     // Catch: java.lang.Exception -> L716
            java.lang.String r14 = r13.getNamespace()     // Catch: java.lang.Exception -> L716
            o.dcu$Fragment$ActionBar r15 = o.InterfaceC13987dcu.Fragment.Companion     // Catch: java.lang.Exception -> L716
            r76 = r1
            java.lang.String r1 = r15.OLrzqt()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4a9
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.OLrzqt()     // Catch: java.lang.Exception -> L455
        L4a5:
            r20 = r1
            goto L538
        L4a9:
            java.lang.String r1 = r15.gEmmrt()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4ba
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.KWHzl()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L4ba:
            java.lang.String r1 = r15.fetchVPNInfo()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4cb
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.gEmmrt()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L4cb:
            java.lang.String r1 = r15.AhwBna()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4dc
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.AYXKKw()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L4dc:
            java.lang.String r1 = r15.KWHzl()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4ed
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.AEQbTJ()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L4ed:
            java.lang.String r1 = r15.AEQbTJ()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L4fe
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.copydefault()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L4fe:
            java.lang.String r1 = r15.copydefault()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L50f
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.EZpvd()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L50f:
            java.lang.String r1 = r15.values()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L520
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.AhwBna()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L520:
            java.lang.String r1 = r15.AYXKKw()     // Catch: java.lang.Exception -> L716
            boolean r1 = kotlin.jvm.internal.Intrinsics.EZpvd(r14, r1)     // Catch: java.lang.Exception -> L716
            if (r1 == 0) goto L532
            o.ebF$ActionBar r1 = o.C15974ebF.Companion     // Catch: java.lang.Exception -> L455
            java.util.List r1 = r1.valueOf()     // Catch: java.lang.Exception -> L455
            goto L4a5
        L532:
            java.util.List r1 = kotlin.collections.CollectionsKt.EZpvd()     // Catch: java.lang.Exception -> L716
            goto L4a5
        L538:
            java.util.List r1 = r13.getChains()     // Catch: java.lang.Exception -> L716
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L716
            r15 = 10
            int r17 = kotlin.collections.CollectionsKt.copydefault(r1, r15)     // Catch: java.lang.Exception -> L716
            int r15 = o.C56421yEt.KWHzl(r17)     // Catch: java.lang.Exception -> L716
            r23 = r2
            r2 = 16
            int r2 = o.C56545yJi.EZpvd(r15, r2)     // Catch: java.lang.Exception -> L716
            r14.<init>(r2)     // Catch: java.lang.Exception -> L716
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L716
        L557:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L716
            if (r2 == 0) goto L64d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L716
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> L716
            java.util.List r17 = o.C13990dcx.copydefault(r5)     // Catch: java.lang.Exception -> L716
            java.util.Iterator r17 = r17.iterator()     // Catch: java.lang.Exception -> L716
        L56c:
            boolean r18 = r17.hasNext()     // Catch: java.lang.Exception -> L716
            if (r18 == 0) goto L5a8
            java.lang.Object r18 = r17.next()     // Catch: java.lang.Exception -> L716
            r21 = r18
            o.dcq r21 = (o.C13983dcq) r21     // Catch: java.lang.Exception -> L716
            o.dcu r21 = r21.copydefault()     // Catch: java.lang.Exception -> L716
            r24 = r3
            r25 = r4
            long r3 = r21.OLrzqt()     // Catch: java.lang.Exception -> L741
            r21 = r1
            o.dcu$Application r1 = o.InterfaceC13987dcu.Companion     // Catch: java.lang.Exception -> L741
            o.dcu r1 = r1.AEQbTJ(r15)     // Catch: java.lang.Exception -> L741
            if (r1 == 0) goto L599
            long r26 = r1.OLrzqt()     // Catch: java.lang.Exception -> L741
            o.dcu$PendingIntent r1 = o.InterfaceC13987dcu.PendingIntent.EZpvd(r26)     // Catch: java.lang.Exception -> L741
            goto L59a
        L599:
            r1 = 0
        L59a:
            boolean r1 = o.InterfaceC13987dcu.PendingIntent.EZpvd(r3, r1)     // Catch: java.lang.Exception -> L741
            if (r1 == 0) goto L5a1
            goto L5b0
        L5a1:
            r1 = r21
            r3 = r24
            r4 = r25
            goto L56c
        L5a8:
            r21 = r1
            r24 = r3
            r25 = r4
            r18 = 0
        L5b0:
            o.dcq r18 = (o.C13983dcq) r18     // Catch: java.lang.Exception -> L741
            if (r18 == 0) goto L639
            kotlinx.serialization.json.JsonObjectBuilder r1 = new kotlinx.serialization.json.JsonObjectBuilder     // Catch: java.lang.Exception -> L741
            r1.<init>()     // Catch: java.lang.Exception -> L741
            java.lang.String r3 = r13.getNamespace()     // Catch: java.lang.Exception -> L741
            o.dcu$Fragment$ActionBar r4 = o.InterfaceC13987dcu.Fragment.Companion     // Catch: java.lang.Exception -> L741
            java.lang.String r15 = r4.copydefault()     // Catch: java.lang.Exception -> L741
            boolean r3 = kotlin.jvm.internal.Intrinsics.EZpvd(r3, r15)     // Catch: java.lang.Exception -> L741
            java.lang.String r15 = "publicKey"
            if (r3 == 0) goto L5eb
            java.lang.Class<o.bdN> r3 = o.InterfaceC9848bdN.class
            o.rlC r3 = o.C43251rlk.copydefault(r3)     // Catch: java.lang.Exception -> L741
            o.bdN r3 = (o.InterfaceC9848bdN) r3     // Catch: java.lang.Exception -> L741
            o.dcu r17 = r18.copydefault()     // Catch: java.lang.Exception -> L741
            r26 = r7
            r27 = r8
            long r7 = r17.OLrzqt()     // Catch: java.lang.Exception -> L741
            java.lang.String r7 = r5.OLrzqt(r7)     // Catch: java.lang.Exception -> L741
            java.lang.String r3 = r3.KWHzl(r7)     // Catch: java.lang.Exception -> L741
            kotlinx.serialization.json.JsonElementBuildersKt.put(r1, r15, r3)     // Catch: java.lang.Exception -> L741
            goto L5fe
        L5eb:
            r26 = r7
            r27 = r8
            o.dcu r3 = r18.copydefault()     // Catch: java.lang.Exception -> L741
            long r7 = r3.OLrzqt()     // Catch: java.lang.Exception -> L741
            java.lang.String r3 = r5.OLrzqt(r7)     // Catch: java.lang.Exception -> L741
            kotlinx.serialization.json.JsonElementBuildersKt.put(r1, r15, r3)     // Catch: java.lang.Exception -> L741
        L5fe:
            java.lang.String r3 = r13.getNamespace()     // Catch: java.lang.Exception -> L741
            java.lang.String r4 = r4.KWHzl()     // Catch: java.lang.Exception -> L741
            boolean r3 = kotlin.jvm.internal.Intrinsics.EZpvd(r3, r4)     // Catch: java.lang.Exception -> L741
            if (r3 == 0) goto L634
            o.bAY r3 = o.C8322bAY.KWHzl     // Catch: java.lang.Exception -> L741
            o.dcu r4 = r18.copydefault()     // Catch: java.lang.Exception -> L741
            long r7 = r4.OLrzqt()     // Catch: java.lang.Exception -> L741
            java.lang.String r4 = r18.EZpvd()     // Catch: java.lang.Exception -> L741
            int r3 = r3.KWHzl(r7, r4)     // Catch: java.lang.Exception -> L741
            java.lang.Integer r3 = o.C56443yFo.AEQbTJ(r3)     // Catch: java.lang.Exception -> L741
            java.lang.String r4 = "addressType"
            kotlinx.serialization.json.JsonElementBuildersKt.put(r1, r4, r3)     // Catch: java.lang.Exception -> L741
            java.lang.String r3 = r18.EZpvd()     // Catch: java.lang.Exception -> L741
            java.lang.String r3 = r5.EZpvd(r3)     // Catch: java.lang.Exception -> L741
            java.lang.String r4 = "compressedPublicKey"
            kotlinx.serialization.json.JsonElementBuildersKt.put(r1, r4, r3)     // Catch: java.lang.Exception -> L741
        L634:
            kotlinx.serialization.json.JsonObject r1 = r1.build()     // Catch: java.lang.Exception -> L741
            goto L63e
        L639:
            r26 = r7
            r27 = r8
            r1 = 0
        L63e:
            r14.put(r2, r1)     // Catch: java.lang.Exception -> L741
            r1 = r21
            r3 = r24
            r4 = r25
            r7 = r26
            r8 = r27
            goto L557
        L64d:
            r24 = r3
            r25 = r4
            r26 = r7
            r27 = r8
            java.util.Map r1 = r13.getParams()     // Catch: java.lang.Exception -> L741
            if (r1 == 0) goto L6ba
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L741
            int r3 = r1.size()     // Catch: java.lang.Exception -> L741
            int r3 = o.C56421yEt.KWHzl(r3)     // Catch: java.lang.Exception -> L741
            r2.<init>(r3)     // Catch: java.lang.Exception -> L741
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L741
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L741
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L741
        L672:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L741
            if (r3 == 0) goto L6b7
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L741
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> L741
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Exception -> L741
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> L741
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request r3 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request) r3     // Catch: java.lang.Exception -> L741
            boolean r7 = r3 instanceof com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.TonAddress     // Catch: java.lang.Exception -> L741
            if (r7 == 0) goto L694
            r17 = r1
            r1 = r26
            goto L6b1
        L694:
            boolean r7 = r3 instanceof com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.TonProof     // Catch: java.lang.Exception -> L741
            if (r7 == 0) goto L69d
            r17 = r1
            r1 = r27
            goto L6b1
        L69d:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r7 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r8 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.METHOD_NOT_SUPPORTED     // Catch: java.lang.Exception -> L741
            r17 = r1
            r1 = 0
            r15 = 2
            r7.<init>(r8, r1, r15, r1)     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error r1 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error     // Catch: java.lang.Exception -> L741
            r1.<init>(r3, r7)     // Catch: java.lang.Exception -> L741
        L6b1:
            r2.put(r4, r1)     // Catch: java.lang.Exception -> L741
            r1 = r17
            goto L672
        L6b7:
            r21 = r2
            goto L6bc
        L6ba:
            r21 = 0
        L6bc:
            if (r21 == 0) goto L6f8
            boolean r1 = r21.isEmpty()     // Catch: java.lang.Exception -> L741
            if (r1 == 0) goto L6c5
            goto L6f8
        L6c5:
            java.util.Set r1 = r21.entrySet()     // Catch: java.lang.Exception -> L741
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L741
        L6cd:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L741
            if (r2 == 0) goto L6f8
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L741
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L741
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response r2 = (com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response) r2     // Catch: java.lang.Exception -> L741
            boolean r2 = r2.isUserReject()     // Catch: java.lang.Exception -> L741
            if (r2 == 0) goto L6cd
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r2 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r3 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.USER_REJECTED     // Catch: java.lang.Exception -> L741
            r4 = 2
            r5 = 0
            r2.<init>(r3, r5, r4, r5)     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error r3 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error     // Catch: java.lang.Exception -> L741
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L741
            return r3
        L6f8:
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account r1 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account     // Catch: java.lang.Exception -> L741
            java.lang.String r18 = r13.getNamespace()     // Catch: java.lang.Exception -> L741
            r17 = r1
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> L741
            r9.add(r1)     // Catch: java.lang.Exception -> L741
            r1 = r76
            r2 = r23
            r3 = r24
            r4 = r25
            r7 = r26
            r8 = r27
            goto L47d
        L716:
            r0 = move-exception
            r24 = r3
        L719:
            r1 = r0
            goto L743
        L71b:
            r23 = r2
            r24 = r3
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L1853
            r1.<init>()     // Catch: java.lang.Exception -> L1853
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1853
            r2.<init>()     // Catch: java.lang.Exception -> L1853
            java.util.Iterator r3 = r9.iterator()     // Catch: java.lang.Exception -> L1853
        L72d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L1853
            if (r4 == 0) goto L747
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L741
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account r4 = (com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account) r4     // Catch: java.lang.Exception -> L741
            java.util.List r4 = r4.getAddresses()     // Catch: java.lang.Exception -> L741
            kotlin.collections.CollectionsKt.copydefault(r2, r4)     // Catch: java.lang.Exception -> L741
            goto L72d
        L741:
            r0 = move-exception
            goto L719
        L743:
            r3 = r24
            goto L185b
        L747:
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r3 = r11.$requestAccounts     // Catch: java.lang.Exception -> L1853
            java.util.List r3 = r3.getConnectRequestMethods()     // Catch: java.lang.Exception -> L1853
            if (r3 == 0) goto L17d7
            o.eaV r4 = r11.$connectAndSignData     // Catch: java.lang.Exception -> L1853
            o.ebs r5 = r11.this$0     // Catch: java.lang.Exception -> L1853
            o.ctV r6 = r11.$wallet     // Catch: java.lang.Exception -> L1853
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r7 = r11.$requestAccounts     // Catch: java.lang.Exception -> L1853
            com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo r8 = r11.$dAppInfo     // Catch: java.lang.Exception -> L1853
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1853
            r14 = 10
            int r15 = kotlin.collections.CollectionsKt.copydefault(r3, r14)     // Catch: java.lang.Exception -> L1853
            r13.<init>(r15)     // Catch: java.lang.Exception -> L1853
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L1853
            r14 = r1
            r15 = r9
            r17 = r10
            r9 = r24
            r73 = r8
            r8 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r73
        L777:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L17d1
            if (r1 == 0) goto L17c0
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L17bb
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod r1 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) r1     // Catch: java.lang.Exception -> L17bb
            if (r3 == 0) goto L78f
            o.bFv r18 = r3.EZpvd()     // Catch: java.lang.Exception -> L78c
            r76 = r9
            goto L793
        L78c:
            r0 = move-exception
            goto L81e
        L78f:
            r76 = r9
            r18 = 0
        L793:
            if (r18 == 0) goto L822
            o.bFv r9 = r3.EZpvd()     // Catch: java.lang.Exception -> L81b
            r11.L$0 = r15     // Catch: java.lang.Exception -> L81b
            r11.L$1 = r14     // Catch: java.lang.Exception -> L81b
            r11.L$2 = r2     // Catch: java.lang.Exception -> L81b
            r11.L$3 = r3     // Catch: java.lang.Exception -> L81b
            r11.L$4 = r4     // Catch: java.lang.Exception -> L81b
            r11.L$5 = r5     // Catch: java.lang.Exception -> L81b
            r11.L$6 = r6     // Catch: java.lang.Exception -> L81b
            r11.L$7 = r7     // Catch: java.lang.Exception -> L81b
            r11.L$8 = r13     // Catch: java.lang.Exception -> L81b
            r11.L$9 = r8     // Catch: java.lang.Exception -> L81b
            r11.L$10 = r1     // Catch: java.lang.Exception -> L81b
            r11.L$11 = r13     // Catch: java.lang.Exception -> L81b
            r19 = r10
            r10 = 0
            r11.L$12 = r10     // Catch: java.lang.Exception -> L81b
            r10 = 1
            r11.label = r10     // Catch: java.lang.Exception -> L81b
            java.lang.Object r9 = o.C16013ebs.KWHzl(r4, r1, r2, r9, r11)     // Catch: java.lang.Exception -> L81b
            if (r9 != r12) goto L7c0
            return r12
        L7c0:
            r10 = r3
            r20 = r9
            r18 = r17
            r3 = r76
            r9 = r5
            r5 = r8
            r17 = r13
            r76 = r15
            r15 = r2
            r8 = r6
            r6 = r17
            r2 = r23
            r13 = r4
            r4 = r1
        L7d5:
            java.lang.Throwable r1 = kotlin.Result.m7380exceptionOrNullimpl(r20)     // Catch: java.lang.Exception -> L817
            if (r1 == 0) goto L7f6
            r21 = r4
            java.lang.String r4 = r1.getMessage()     // Catch: java.lang.Exception -> L817
            r22 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L817
            r5.<init>()     // Catch: java.lang.Exception -> L817
            r5.append(r2)     // Catch: java.lang.Exception -> L817
            r5.append(r4)     // Catch: java.lang.Exception -> L817
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L817
            o.pUU.AEQbTJ(r3, r4, r1)     // Catch: java.lang.Exception -> L817
            goto L7fa
        L7f6:
            r21 = r4
            r22 = r5
        L7fa:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r20)     // Catch: java.lang.Exception -> L817
            r4 = r10
            r26 = r19
            r5 = r21
            r10 = r2
            r2 = r17
            r17 = r1
            r1 = r15
            r15 = r76
            r76 = r3
            r3 = r13
            r13 = r12
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r22
            goto L16e0
        L817:
            r0 = move-exception
            r1 = r0
            r9 = r3
            goto L81f
        L81b:
            r0 = move-exception
            r9 = r76
        L81e:
            r1 = r0
        L81f:
            r3 = r9
            goto L185b
        L822:
            r19 = r10
            java.lang.String r9 = r1.getMethod()     // Catch: java.lang.Exception -> L17b6
            int r10 = r9.hashCode()     // Catch: java.lang.Exception -> L17b6
            r20 = r12
            java.lang.String r12 = "message"
            switch(r10) {
                case -2021880892: goto L1569;
                case -1876451729: goto L148d;
                case -1073453553: goto L134a;
                case -782293348: goto L11b9;
                case -506050796: goto Lf7c;
                case 27131247: goto Le6f;
                case 581195868: goto Ld90;
                case 907795424: goto Lcf3;
                case 1105274258: goto Lba0;
                case 1402426418: goto La91;
                case 1900613984: goto L930;
                case 2071636776: goto L84d;
                default: goto L833;
            }
        L833:
            r24 = r76
            r12 = r2
            r29 = r3
            r27 = r4
            r18 = r5
            r25 = r6
            r22 = r8
            r28 = r13
            r26 = r19
            r13 = r20
            r20 = r7
            r19 = r14
            r14 = r1
            goto L1669
        L84d:
            java.lang.String r10 = "tron_signMessage"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Exception -> L92b
            if (r9 != 0) goto L866
            r30 = r76
            r10 = r3
            r3 = r8
            r32 = r19
            r8 = r4
            r4 = r13
            r13 = r2
            r2 = r14
            r73 = r7
            r7 = r5
            r5 = r73
            goto Lda7
        L866:
            kotlinx.serialization.json.JsonObject r9 = r1.getParams()     // Catch: java.lang.Exception -> L92b
            if (r9 == 0) goto L914
            o.ebF r10 = o.C16013ebs.copydefault(r4)     // Catch: java.lang.Exception -> L92b
            java.lang.String r18 = r5.DbNXlk()     // Catch: java.lang.Exception -> L92b
            java.lang.String r21 = r1.getCaipChainId()     // Catch: java.lang.Exception -> L92b
            java.lang.Object r9 = r9.get(r12)     // Catch: java.lang.Exception -> L92b
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9     // Catch: java.lang.Exception -> L92b
            if (r9 == 0) goto L890
            kotlinx.serialization.json.JsonPrimitive r9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r9)     // Catch: java.lang.Exception -> L88b
            if (r9 == 0) goto L890
            java.lang.String r9 = r9.getContent()     // Catch: java.lang.Exception -> L88b
            goto L891
        L88b:
            r0 = move-exception
            r9 = r76
            goto La67
        L890:
            r9 = 0
        L891:
            if (r9 != 0) goto L895
            r9 = r17
        L895:
            com.okinc.business.defi.api.bean.TronSignMethodVersion r12 = com.okinc.business.defi.api.bean.TronSignMethodVersion.V1     // Catch: java.lang.Exception -> L92b
            r11.L$0 = r15     // Catch: java.lang.Exception -> L92b
            r11.L$1 = r14     // Catch: java.lang.Exception -> L92b
            r11.L$2 = r2     // Catch: java.lang.Exception -> L92b
            r11.L$3 = r3     // Catch: java.lang.Exception -> L92b
            r11.L$4 = r4     // Catch: java.lang.Exception -> L92b
            r11.L$5 = r5     // Catch: java.lang.Exception -> L92b
            r11.L$6 = r6     // Catch: java.lang.Exception -> L92b
            r11.L$7 = r7     // Catch: java.lang.Exception -> L92b
            r11.L$8 = r13     // Catch: java.lang.Exception -> L92b
            r11.L$9 = r8     // Catch: java.lang.Exception -> L92b
            r11.L$10 = r1     // Catch: java.lang.Exception -> L92b
            r11.L$11 = r13     // Catch: java.lang.Exception -> L92b
            r22 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> L92b
            r1 = 11
            r11.label = r1     // Catch: java.lang.Exception -> L92b
            r24 = 0
            r25 = 32
            r26 = 0
            r27 = r22
            r1 = r10
            r10 = r2
            r2 = r18
            r28 = r3
            r3 = r7
            r22 = r4
            r4 = r21
            r21 = r5
            r5 = r9
            r9 = r6
            r6 = r12
            r12 = r7
            r7 = r24
            r29 = r8
            r8 = r75
            r30 = r76
            r31 = r9
            r9 = r25
            r76 = r10
            r32 = r19
            r10 = r26
            java.lang.Object r1 = o.C15974ebF.m8594onTronSignMessagebMdYcbs$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lf76
            r10 = r20
            if (r1 != r10) goto L8ec
            return r10
        L8ec:
            r18 = r76
            r19 = r1
            r7 = r12
            r6 = r13
            r1 = r14
            r12 = r17
            r9 = r21
            r2 = r23
            r4 = r27
            r14 = r28
            r5 = r29
            r3 = r30
            r8 = r31
            r17 = r6
            r13 = r22
        L907:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
        L90b:
            r72 = r18
            r26 = r32
            r18 = r13
            r13 = r10
            goto L1638
        L914:
            r30 = r76
            r32 = r19
            r27 = r1
            r28 = r3
            r9 = r4
            r12 = r5
            r53 = r6
            r52 = r7
            r50 = r8
            r51 = r13
            r10 = r20
            r13 = r2
            goto Lf60
        L92b:
            r0 = move-exception
            r30 = r76
            goto Lf77
        L930:
            r30 = r76
            r27 = r1
            r76 = r2
            r28 = r3
            r22 = r4
            r21 = r5
            r31 = r6
            r12 = r7
            r29 = r8
            r32 = r19
            r10 = r20
            java.lang.String r1 = "cosmos_signArbitrary"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> La8a
            if (r1 != 0) goto L963
            r56 = r12
            r55 = r13
            r20 = r14
            r12 = r21
            r14 = r27
            r54 = r28
            r11 = r30
            r57 = r31
            r26 = r32
            r13 = r76
            goto L11d8
        L963:
            java.lang.String r1 = "Start cosmos signArbitrary"
            r9 = r30
            o.pUU.KWHzl(r9, r1)     // Catch: java.lang.Exception -> La83
            kotlinx.serialization.json.JsonObject r1 = r27.getParams()     // Catch: java.lang.Exception -> La83
            if (r1 == 0) goto La6a
            java.util.Iterator r2 = r76.iterator()     // Catch: java.lang.Exception -> La83
        L974:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> La83
            if (r3 == 0) goto L99a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L995
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L992
            o.dcq$StateListAnimator r5 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> L992
            java.lang.String r4 = r5.KWHzl(r4)     // Catch: java.lang.Exception -> L992
            java.lang.String r5 = r27.getCaipChainId()     // Catch: java.lang.Exception -> L992
            boolean r4 = kotlin.jvm.internal.Intrinsics.EZpvd(r4, r5)     // Catch: java.lang.Exception -> L992
            if (r4 == 0) goto L974
            goto L99b
        L992:
            r0 = move-exception
            goto La67
        L995:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto La8e
        L99a:
            r3 = 0
        L99b:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La65
            if (r3 == 0) goto La3f
            o.dcq$StateListAnimator r2 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> La65
            java.lang.String r2 = r2.OLrzqt(r3)     // Catch: java.lang.Exception -> La65
            if (r2 == 0) goto La3f
            o.eaX r3 = o.C16013ebs.KWHzl(r22)     // Catch: java.lang.Exception -> La65
            kotlinx.serialization.json.JsonObject r5 = r3.KWHzl(r1, r2)     // Catch: java.lang.Exception -> La65
            o.ebF r1 = o.C16013ebs.copydefault(r22)     // Catch: java.lang.Exception -> La65
            java.lang.String r2 = r21.DbNXlk()     // Catch: java.lang.Exception -> La65
            java.lang.String r4 = r27.getCaipChainId()     // Catch: java.lang.Exception -> La65
            r11.L$0 = r15     // Catch: java.lang.Exception -> La65
            r11.L$1 = r14     // Catch: java.lang.Exception -> La65
            r8 = r76
            r11.L$2 = r8     // Catch: java.lang.Exception -> La65
            r7 = r28
            r11.L$3 = r7     // Catch: java.lang.Exception -> La65
            r6 = r22
            r11.L$4 = r6     // Catch: java.lang.Exception -> La65
            r3 = r21
            r11.L$5 = r3     // Catch: java.lang.Exception -> La65
            r30 = r9
            r9 = r31
            r11.L$6 = r9     // Catch: java.lang.Exception -> La8a
            r11.L$7 = r12     // Catch: java.lang.Exception -> La8a
            r11.L$8 = r13     // Catch: java.lang.Exception -> La8a
            r31 = r9
            r9 = r29
            r11.L$9 = r9     // Catch: java.lang.Exception -> La8a
            r29 = r9
            r9 = r27
            r11.L$10 = r9     // Catch: java.lang.Exception -> La8a
            r11.L$11 = r13     // Catch: java.lang.Exception -> La8a
            r21 = r3
            r3 = 0
            r11.L$12 = r3     // Catch: java.lang.Exception -> La8a
            r3 = 10
            r11.label = r3     // Catch: java.lang.Exception -> La8a
            r18 = 0
            r19 = 16
            r20 = 0
            r76 = r21
            r3 = r12
            r22 = r6
            r6 = r18
            r33 = r7
            r7 = r75
            r34 = r8
            r8 = r19
            r27 = r9
            r19 = r13
            r35 = r29
            r13 = r30
            r36 = r31
            r9 = r20
            java.lang.Object r1 = o.C15974ebF.m8583onCosmosSignArbitraryhUnOzRk$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> La3c
            if (r1 != r10) goto La18
            return r10
        La18:
            r9 = r76
            r7 = r12
            r3 = r13
            r12 = r17
            r6 = r19
            r17 = r6
            r13 = r22
            r2 = r23
            r4 = r27
            r5 = r35
            r8 = r36
            r19 = r1
            r1 = r15
            r15 = r34
        La31:
            kotlin.Result r18 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r26 = r32
            r73 = r13
            r13 = r10
            goto L12df
        La3c:
            r0 = move-exception
            goto La8d
        La3f:
            r34 = r76
            r19 = r13
            r76 = r21
            r33 = r28
            r35 = r29
            r36 = r31
            r13 = r9
            r48 = r12
            r24 = r13
            r60 = r14
            r61 = r19
            r14 = r27
            r26 = r32
            r62 = r33
            r59 = r35
            r58 = r36
            r12 = r76
            r13 = r10
            r76 = r22
            goto L1305
        La65:
            r0 = move-exception
            r13 = r9
        La67:
            r1 = r0
            goto L185c
        La6a:
            r34 = r76
            r19 = r13
            r11 = r9
            r56 = r12
            r20 = r14
            r55 = r19
            r12 = r21
            r14 = r27
            r54 = r28
            r57 = r31
            r26 = r32
            r13 = r34
            goto L1190
        La83:
            r0 = move-exception
            r13 = r9
            goto La8d
        La86:
            r0 = move-exception
            r13 = r30
            goto La8d
        La8a:
            r0 = move-exception
            r13 = r30
        La8d:
            r1 = r0
        La8e:
            r9 = r13
            goto L185c
        La91:
            r27 = r1
            r34 = r2
            r33 = r3
            r22 = r4
            r36 = r6
            r35 = r8
            r32 = r19
            r10 = r20
            r8 = r7
            r19 = r13
            r13 = r76
            r76 = r5
            java.lang.String r1 = "sui_signPersonalMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> Lb9b
            if (r1 != 0) goto Lacb
            r18 = r76
            r20 = r8
            r24 = r13
            r28 = r19
            r26 = r32
            r29 = r33
            r12 = r34
            r25 = r36
            r13 = r10
            r19 = r14
            r14 = r27
            r27 = r22
            r22 = r35
            goto L1669
        Lacb:
            java.lang.String r1 = "Start onSuiSignPersonalMessage"
            o.pUU.KWHzl(r13, r1)     // Catch: java.lang.Exception -> Lb9b
            kotlinx.serialization.json.JsonObject r1 = r27.getParams()     // Catch: java.lang.Exception -> Lb9b
            if (r1 == 0) goto Lb80
            o.ebF r2 = o.C16013ebs.copydefault(r22)     // Catch: java.lang.Exception -> Lb9b
            java.lang.String r3 = r76.DbNXlk()     // Catch: java.lang.Exception -> Lb9b
            java.lang.String r4 = r27.getCaipChainId()     // Catch: java.lang.Exception -> Lb9b
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Exception -> Lb9b
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Exception -> Lb9b
            if (r1 == 0) goto Laf5
            kotlinx.serialization.json.JsonPrimitive r1 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r1)     // Catch: java.lang.Exception -> Lb9b
            if (r1 == 0) goto Laf5
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Exception -> Lb9b
            goto Laf6
        Laf5:
            r1 = 0
        Laf6:
            if (r1 != 0) goto Lafb
            r5 = r17
            goto Lafc
        Lafb:
            r5 = r1
        Lafc:
            r11.L$0 = r15     // Catch: java.lang.Exception -> Lb9b
            r11.L$1 = r14     // Catch: java.lang.Exception -> Lb9b
            r12 = r34
            r11.L$2 = r12     // Catch: java.lang.Exception -> Lb9b
            r9 = r33
            r11.L$3 = r9     // Catch: java.lang.Exception -> Lb9b
            r7 = r22
            r11.L$4 = r7     // Catch: java.lang.Exception -> Lb9b
            r6 = r76
            r11.L$5 = r6     // Catch: java.lang.Exception -> Lb9b
            r1 = r36
            r11.L$6 = r1     // Catch: java.lang.Exception -> Lb9b
            r11.L$7 = r8     // Catch: java.lang.Exception -> Lb9b
            r20 = r10
            r10 = r19
            r11.L$8 = r10     // Catch: java.lang.Exception -> Lb9b
            r28 = r9
            r9 = r35
            r11.L$9 = r9     // Catch: java.lang.Exception -> Lb9b
            r29 = r9
            r9 = r27
            r11.L$10 = r9     // Catch: java.lang.Exception -> Lb9b
            r11.L$11 = r10     // Catch: java.lang.Exception -> Lb9b
            r31 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> Lb9b
            r1 = 7
            r11.label = r1     // Catch: java.lang.Exception -> Lb9b
            r18 = 1
            r19 = 0
            r21 = 32
            r22 = 0
            r37 = r31
            r1 = r2
            r2 = r3
            r3 = r8
            r76 = r6
            r6 = r18
            r24 = r7
            r7 = r19
            r38 = r8
            r8 = r75
            r27 = r9
            r40 = r28
            r39 = r29
            r9 = r21
            r41 = r10
            r19 = r14
            r14 = r20
            r10 = r22
            java.lang.Object r1 = o.C15974ebF.m8592onSuiSignMessagebMdYcbs$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lb9b
            if (r1 != r14) goto Lb62
            return r14
        Lb62:
            r9 = r76
            r3 = r13
            r10 = r17
            r18 = r19
            r2 = r23
            r13 = r24
            r4 = r27
            r8 = r37
            r7 = r38
            r5 = r39
            r6 = r41
            r19 = r1
            r1 = r6
        Lb7a:
            kotlin.Result r17 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Lcb9
            goto Lca2
        Lb80:
            r41 = r19
            r19 = r14
            r14 = r10
            r24 = r76
            r30 = r13
            r12 = r19
            r19 = r22
            r44 = r27
            r45 = r33
            r13 = r34
            r43 = r35
            r42 = r36
            r22 = r8
            goto Lcd2
        Lb9b:
            r0 = move-exception
            r1 = r0
            r9 = r13
            goto L11b5
        Lba0:
            r27 = r1
            r10 = r2
            r40 = r3
            r24 = r4
            r37 = r6
            r38 = r7
            r39 = r8
            r41 = r13
            r32 = r19
            r13 = r76
            r76 = r5
            r19 = r14
            r14 = r20
            java.lang.String r1 = "sui_signMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> Lceb
            if (r1 != 0) goto Lbdb
            r18 = r76
            r12 = r10
            r26 = r32
            r25 = r37
            r20 = r38
            r22 = r39
            r29 = r40
            r28 = r41
            r73 = r24
            r24 = r13
            r13 = r14
            r14 = r27
            r27 = r73
            goto L1669
        Lbdb:
            java.lang.String r1 = "Start onSuiSignMessage"
            o.pUU.KWHzl(r13, r1)     // Catch: java.lang.Exception -> Lceb
            kotlinx.serialization.json.JsonObject r1 = r27.getParams()     // Catch: java.lang.Exception -> Lceb
            if (r1 == 0) goto Lcbf
            o.ebF r2 = o.C16013ebs.copydefault(r24)     // Catch: java.lang.Exception -> Lceb
            java.lang.String r3 = r76.DbNXlk()     // Catch: java.lang.Exception -> Lceb
            java.lang.String r4 = r27.getCaipChainId()     // Catch: java.lang.Exception -> Lceb
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Exception -> Lceb
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Exception -> Lceb
            if (r1 == 0) goto Lc05
            kotlinx.serialization.json.JsonPrimitive r1 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r1)     // Catch: java.lang.Exception -> Lb9b
            if (r1 == 0) goto Lc05
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Exception -> Lb9b
            goto Lc06
        Lc05:
            r1 = 0
        Lc06:
            if (r1 != 0) goto Lc0b
            r5 = r17
            goto Lc0c
        Lc0b:
            r5 = r1
        Lc0c:
            r11.L$0 = r15     // Catch: java.lang.Exception -> Lceb
            r12 = r19
            r11.L$1 = r12     // Catch: java.lang.Exception -> Lceb
            r11.L$2 = r10     // Catch: java.lang.Exception -> Lceb
            r9 = r40
            r11.L$3 = r9     // Catch: java.lang.Exception -> Lceb
            r8 = r24
            r11.L$4 = r8     // Catch: java.lang.Exception -> Lceb
            r7 = r76
            r11.L$5 = r7     // Catch: java.lang.Exception -> Lceb
            r6 = r37
            r11.L$6 = r6     // Catch: java.lang.Exception -> Lceb
            r1 = r38
            r11.L$7 = r1     // Catch: java.lang.Exception -> Lceb
            r76 = r10
            r10 = r41
            r11.L$8 = r10     // Catch: java.lang.Exception -> Lceb
            r28 = r9
            r9 = r39
            r11.L$9 = r9     // Catch: java.lang.Exception -> Lceb
            r29 = r9
            r9 = r27
            r11.L$10 = r9     // Catch: java.lang.Exception -> Lceb
            r11.L$11 = r10     // Catch: java.lang.Exception -> Lceb
            r38 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> Lceb
            r1 = 6
            r11.label = r1     // Catch: java.lang.Exception -> Lceb
            r18 = 0
            r19 = 0
            r20 = 32
            r21 = 0
            r22 = r38
            r1 = r2
            r2 = r3
            r3 = r22
            r42 = r6
            r6 = r18
            r24 = r7
            r7 = r19
            r19 = r8
            r8 = r75
            r44 = r9
            r45 = r28
            r43 = r29
            r9 = r20
            r41 = r10
            r30 = r13
            r13 = r76
            r10 = r21
            java.lang.Object r1 = o.C15974ebF.m8592onSuiSignMessagebMdYcbs$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lcbd
            if (r1 != r14) goto Lc75
            return r14
        Lc75:
            r18 = r12
            r10 = r17
            r7 = r22
            r2 = r23
            r9 = r24
            r3 = r30
            r6 = r41
            r17 = r6
            r8 = r42
            r5 = r43
            r4 = r44
            r73 = r19
            r19 = r1
            r1 = r15
            r15 = r13
            r13 = r73
        Lc93:
            kotlin.Result r12 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Lcb9
            r40 = r45
            r73 = r15
            r15 = r1
            r1 = r17
            r17 = r12
            r12 = r73
        Lca2:
            r23 = r2
            r2 = r12
            r19 = r17
            r26 = r32
            r17 = r1
            r1 = r4
            r4 = r13
            r13 = r14
            r14 = r40
        Lcb0:
            r73 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            r6 = r73
            goto L164b
        Lcb9:
            r0 = move-exception
            r1 = r0
            goto L1147
        Lcbd:
            r0 = move-exception
            goto Lcee
        Lcbf:
            r30 = r13
            r12 = r19
            r19 = r24
            r44 = r27
            r42 = r37
            r22 = r38
            r43 = r39
            r45 = r40
            r24 = r76
            r13 = r10
        Lcd2:
            r20 = r12
            r10 = r14
            r56 = r22
            r12 = r24
            r11 = r30
            r26 = r32
            r55 = r41
            r57 = r42
            r29 = r43
            r14 = r44
            r54 = r45
            r22 = r19
            goto L1190
        Lceb:
            r0 = move-exception
            r30 = r13
        Lcee:
            r1 = r0
            r9 = r30
            goto L11b5
        Lcf3:
            r30 = r76
            r44 = r1
            r45 = r3
            r24 = r5
            r42 = r6
            r22 = r7
            r43 = r8
            r41 = r13
            r12 = r14
            r32 = r19
            r14 = r20
            r13 = r2
            r19 = r4
            java.lang.String r1 = "sync_all_addresses"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> Lf76
            if (r1 != 0) goto Ld27
            r10 = r14
            r8 = r19
            r52 = r22
            r51 = r41
            r53 = r42
            r50 = r43
            r27 = r44
            r28 = r45
            r14 = r12
            r12 = r24
            goto Lf99
        Ld27:
            o.ebF r1 = o.C16013ebs.copydefault(r19)     // Catch: java.lang.Exception -> Lf76
            java.lang.String r2 = r24.DbNXlk()     // Catch: java.lang.Exception -> Lf76
            r11.L$0 = r15     // Catch: java.lang.Exception -> Lf76
            r11.L$1 = r12     // Catch: java.lang.Exception -> Lf76
            r11.L$2 = r13     // Catch: java.lang.Exception -> Lf76
            r10 = r45
            r11.L$3 = r10     // Catch: java.lang.Exception -> Lf76
            r8 = r19
            r11.L$4 = r8     // Catch: java.lang.Exception -> Lf76
            r7 = r24
            r11.L$5 = r7     // Catch: java.lang.Exception -> Lf76
            r6 = r42
            r11.L$6 = r6     // Catch: java.lang.Exception -> Lf76
            r5 = r22
            r11.L$7 = r5     // Catch: java.lang.Exception -> Lf76
            r4 = r41
            r11.L$8 = r4     // Catch: java.lang.Exception -> Lf76
            r3 = r43
            r11.L$9 = r3     // Catch: java.lang.Exception -> Lf76
            r9 = r44
            r11.L$10 = r9     // Catch: java.lang.Exception -> Lf76
            r11.L$11 = r4     // Catch: java.lang.Exception -> Lf76
            r27 = r9
            r9 = 0
            r11.L$12 = r9     // Catch: java.lang.Exception -> Lf76
            r9 = 2
            r11.label = r9     // Catch: java.lang.Exception -> Lf76
            java.lang.Object r1 = r1.EZpvd(r2, r11)     // Catch: java.lang.Exception -> Lf76
            if (r1 != r14) goto Ld66
            return r14
        Ld66:
            r19 = r1
            r9 = r7
            r1 = r12
            r18 = r13
            r2 = r23
            r7 = r5
            r13 = r8
            r12 = r10
            r10 = r17
            r5 = r3
            r17 = r4
            r8 = r6
            r3 = r30
            r6 = r17
            r4 = r27
        Ld7d:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r72 = r18
            r26 = r32
            r18 = r13
            r13 = r14
            r14 = r12
        Ld89:
            r12 = r10
            goto L1638
        Ld8c:
            r0 = move-exception
            r1 = r0
            goto L185b
        Ld90:
            r30 = r76
            r10 = r3
            r3 = r8
            r32 = r19
            r8 = r4
            r4 = r13
            r13 = r2
            r2 = r14
            r73 = r7
            r7 = r5
            r5 = r73
            java.lang.String r14 = "personal_sign"
            boolean r9 = r9.equals(r14)     // Catch: java.lang.Exception -> Lf76
            if (r9 != 0) goto Ldc1
        Lda7:
            r14 = r1
            r19 = r2
            r22 = r3
            r28 = r4
            r25 = r6
            r18 = r7
            r27 = r8
            r29 = r10
            r12 = r13
            r13 = r20
            r24 = r30
            r26 = r32
            r20 = r5
            goto L1669
        Ldc1:
            kotlinx.serialization.json.JsonObject r9 = r1.getParams()     // Catch: java.lang.Exception -> Lf76
            if (r9 == 0) goto Le5c
            o.ebF r14 = o.C16013ebs.copydefault(r8)     // Catch: java.lang.Exception -> Lf76
            java.lang.String r18 = r7.DbNXlk()     // Catch: java.lang.Exception -> Lf76
            java.lang.String r19 = r1.getCaipChainId()     // Catch: java.lang.Exception -> Lf76
            java.lang.Object r9 = r9.get(r12)     // Catch: java.lang.Exception -> Lf76
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9     // Catch: java.lang.Exception -> Lf76
            if (r9 == 0) goto Lde6
            kotlinx.serialization.json.JsonPrimitive r9 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r9)     // Catch: java.lang.Exception -> Lf76
            if (r9 == 0) goto Lde6
            java.lang.String r9 = r9.getContent()     // Catch: java.lang.Exception -> Lf76
            goto Lde7
        Lde6:
            r9 = 0
        Lde7:
            if (r9 != 0) goto Ldeb
            r9 = r17
        Ldeb:
            r11.L$0 = r15     // Catch: java.lang.Exception -> Lf76
            r11.L$1 = r2     // Catch: java.lang.Exception -> Lf76
            r11.L$2 = r13     // Catch: java.lang.Exception -> Lf76
            r11.L$3 = r10     // Catch: java.lang.Exception -> Lf76
            r11.L$4 = r8     // Catch: java.lang.Exception -> Lf76
            r11.L$5 = r7     // Catch: java.lang.Exception -> Lf76
            r11.L$6 = r6     // Catch: java.lang.Exception -> Lf76
            r11.L$7 = r5     // Catch: java.lang.Exception -> Lf76
            r11.L$8 = r4     // Catch: java.lang.Exception -> Lf76
            r11.L$9 = r3     // Catch: java.lang.Exception -> Lf76
            r11.L$10 = r1     // Catch: java.lang.Exception -> Lf76
            r11.L$11 = r4     // Catch: java.lang.Exception -> Lf76
            r12 = 0
            r11.L$12 = r12     // Catch: java.lang.Exception -> Lf76
            r12 = 4
            r11.label = r12     // Catch: java.lang.Exception -> Lf76
            r12 = 0
            r21 = 16
            r22 = 0
            r27 = r1
            r1 = r14
            r14 = r2
            r2 = r18
            r46 = r3
            r3 = r5
            r47 = r4
            r4 = r19
            r48 = r5
            r5 = r9
            r9 = r6
            r6 = r12
            r12 = r7
            r7 = r75
            r24 = r8
            r8 = r21
            r49 = r9
            r9 = r22
            java.lang.Object r1 = o.C15974ebF.m8586onPersonalSignhUnOzRk$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lf76
            r8 = r20
            if (r1 != r8) goto Le34
            return r8
        Le34:
            r19 = r1
            r9 = r12
            r12 = r13
            r1 = r14
            r2 = r23
            r13 = r24
            r4 = r27
            r3 = r30
            r5 = r46
            r6 = r47
            r7 = r48
            r14 = r10
            r10 = r17
        Le4a:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r72 = r12
            r18 = r13
            r26 = r32
            r17 = r47
            r13 = r8
            r12 = r10
            r8 = r49
            goto L1638
        Le5c:
            r14 = r2
            r12 = r7
            r27 = r1
            r50 = r3
            r51 = r4
            r52 = r5
            r53 = r6
            r9 = r8
            r28 = r10
            r10 = r20
            goto Lf60
        Le6f:
            r30 = r76
            r27 = r1
            r10 = r3
            r24 = r4
            r12 = r5
            r49 = r6
            r48 = r7
            r46 = r8
            r47 = r13
            r32 = r19
            r8 = r20
            r13 = r2
            java.lang.String r1 = "wallet_addEthereumChain"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> Lf76
            if (r1 != 0) goto Lea3
            r54 = r10
            r20 = r14
            r22 = r24
            r14 = r27
            r11 = r30
            r26 = r32
            r29 = r46
            r55 = r47
            r56 = r48
            r57 = r49
            r10 = r8
            goto L11d8
        Lea3:
            kotlinx.serialization.json.JsonObject r1 = r27.getParams()     // Catch: java.lang.Exception -> Lf76
            if (r1 == 0) goto Lf53
            o.ebF r2 = o.C16013ebs.copydefault(r24)     // Catch: java.lang.Exception -> Lf76
            java.lang.String r3 = r12.DbNXlk()     // Catch: java.lang.Exception -> Lf76
            kotlinx.serialization.json.Json r4 = o.C16013ebs.AhwBna(r24)     // Catch: java.lang.Exception -> Lf76
            r4.getSerializersModule()     // Catch: java.lang.Exception -> Lf76
            com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain$Companion r5 = com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain.Companion     // Catch: java.lang.Exception -> Lf76
            kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch: java.lang.Exception -> Lf76
            java.lang.Object r1 = r4.decodeFromJsonElement(r5, r1)     // Catch: java.lang.Exception -> Lf76
            r4 = r1
            com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain r4 = (com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain) r4     // Catch: java.lang.Exception -> Lf76
            r11.L$0 = r15     // Catch: java.lang.Exception -> Lf76
            r11.L$1 = r14     // Catch: java.lang.Exception -> Lf76
            r11.L$2 = r13     // Catch: java.lang.Exception -> Lf76
            r11.L$3 = r10     // Catch: java.lang.Exception -> Lf76
            r9 = r24
            r11.L$4 = r9     // Catch: java.lang.Exception -> Lf76
            r11.L$5 = r12     // Catch: java.lang.Exception -> Lf76
            r7 = r49
            r11.L$6 = r7     // Catch: java.lang.Exception -> Lf76
            r6 = r48
            r11.L$7 = r6     // Catch: java.lang.Exception -> Lf76
            r5 = r47
            r11.L$8 = r5     // Catch: java.lang.Exception -> Lf76
            r1 = r46
            r11.L$9 = r1     // Catch: java.lang.Exception -> Lf76
            r20 = r8
            r8 = r27
            r11.L$10 = r8     // Catch: java.lang.Exception -> Lf76
            r11.L$11 = r5     // Catch: java.lang.Exception -> Lf76
            r29 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> Lf76
            r1 = 3
            r11.label = r1     // Catch: java.lang.Exception -> Lf76
            r18 = 0
            r19 = 8
            r21 = 0
            r50 = r29
            r1 = r2
            r2 = r3
            r3 = r6
            r51 = r5
            r5 = r18
            r52 = r6
            r6 = r75
            r53 = r7
            r7 = r19
            r27 = r8
            r28 = r10
            r10 = r20
            r8 = r21
            java.lang.Object r1 = o.C15974ebF.m8576onAddEthereumChainyxL6bBk$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lf76
            if (r1 != r10) goto Lf19
            return r10
        Lf19:
            r19 = r1
            r18 = r13
            r1 = r14
            r2 = r23
            r4 = r27
            r14 = r28
            r3 = r30
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r13 = r9
            r9 = r12
            r12 = r17
            r17 = r6
        Lf34:
            boolean r20 = kotlin.Result.m7384isSuccessimpl(r19)     // Catch: java.lang.Exception -> Ld8c
            if (r20 == 0) goto Lf49
            r76 = r2
            r2 = r19
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Ld8c
            boolean r20 = o.C33129mqd.OLrzqt(r2)     // Catch: java.lang.Exception -> Ld8c
            if (r20 == 0) goto Lf4b
            r1.element = r2     // Catch: java.lang.Exception -> Ld8c
            goto Lf4b
        Lf49:
            r76 = r2
        Lf4b:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r2 = r76
            goto L90b
        Lf53:
            r28 = r10
            r9 = r24
            r50 = r46
            r51 = r47
            r52 = r48
            r53 = r49
            r10 = r8
        Lf60:
            r22 = r9
            r20 = r14
            r14 = r27
            r54 = r28
            r11 = r30
        Lf6a:
            r26 = r32
            r29 = r50
            r55 = r51
            r56 = r52
            r57 = r53
            goto L1190
        Lf76:
            r0 = move-exception
        Lf77:
            r1 = r0
            r9 = r30
            goto L185c
        Lf7c:
            r30 = r76
            r27 = r1
            r28 = r3
            r12 = r5
            r53 = r6
            r52 = r7
            r50 = r8
            r51 = r13
            r32 = r19
            r10 = r20
            r13 = r2
            r8 = r4
            java.lang.String r1 = "aptos_signMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L11af
            if (r1 != 0) goto Lfaf
        Lf99:
            r22 = r8
            r20 = r14
            r14 = r27
            r54 = r28
            r11 = r30
            r26 = r32
            r29 = r50
            r55 = r51
            r56 = r52
            r57 = r53
            goto L11d8
        Lfaf:
            java.lang.String r1 = "Start onAptosSignMessage"
            r9 = r30
            o.pUU.KWHzl(r9, r1)     // Catch: java.lang.Exception -> L11a8
            kotlinx.serialization.json.JsonObject r1 = r27.getParams()     // Catch: java.lang.Exception -> L11a8
            if (r1 == 0) goto L1185
            kotlinx.serialization.json.Json r2 = o.C16013ebs.AhwBna(r8)     // Catch: java.lang.Exception -> L1182
            r2.getSerializersModule()     // Catch: java.lang.Exception -> L1182
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$Companion r3 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.Companion     // Catch: java.lang.Exception -> L1182
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch: java.lang.Exception -> L1182
            java.lang.Object r1 = r2.decodeFromJsonElement(r3, r1)     // Catch: java.lang.Exception -> L1182
            r7 = r1
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest r7 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest) r7     // Catch: java.lang.Exception -> L1182
            java.util.Iterator r1 = r13.iterator()     // Catch: java.lang.Exception -> L1182
        Lfd4:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L1182
            if (r2 == 0) goto Lff2
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L992
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L992
            o.dcq$StateListAnimator r4 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> L992
            java.lang.String r3 = r4.KWHzl(r3)     // Catch: java.lang.Exception -> L992
            java.lang.String r4 = r27.getCaipChainId()     // Catch: java.lang.Exception -> L992
            boolean r3 = kotlin.jvm.internal.Intrinsics.EZpvd(r3, r4)     // Catch: java.lang.Exception -> L992
            if (r3 == 0) goto Lfd4
            goto Lff3
        Lff2:
            r2 = 0
        Lff3:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1182
            if (r2 == 0) goto L114d
            o.dcq$StateListAnimator r1 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> L1182
            java.lang.String r6 = r1.OLrzqt(r2)     // Catch: java.lang.Exception -> L1182
            if (r6 == 0) goto L114d
            java.lang.String r5 = r7.formatFullMessage(r6)     // Catch: java.lang.Exception -> L1182
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L1182
            byte[] r1 = r5.getBytes(r1)     // Catch: java.lang.Exception -> L1182
            r4 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)     // Catch: java.lang.Exception -> L1182
            o.ebz r39 = new o.ebz     // Catch: java.lang.Exception -> L1182
            r39.<init>()     // Catch: java.lang.Exception -> L1182
            java.lang.String r34 = ""
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 30
            r41 = 0
            r33 = r1
            java.lang.String r1 = o.yDR.joinToString$default(r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch: java.lang.Exception -> L1182
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1182
            r2.<init>()     // Catch: java.lang.Exception -> L1182
            java.lang.String r3 = "0x"
            r2.append(r3)     // Catch: java.lang.Exception -> L1182
            r2.append(r1)     // Catch: java.lang.Exception -> L1182
            java.lang.String r18 = r2.toString()     // Catch: java.lang.Exception -> L1182
            o.ebF r1 = o.C16013ebs.copydefault(r8)     // Catch: java.lang.Exception -> L1182
            java.lang.String r2 = r12.DbNXlk()     // Catch: java.lang.Exception -> L1182
            java.lang.String r19 = r27.getCaipChainId()     // Catch: java.lang.Exception -> L1182
            r11.L$0 = r15     // Catch: java.lang.Exception -> L1182
            r11.L$1 = r14     // Catch: java.lang.Exception -> L1182
            r11.L$2 = r13     // Catch: java.lang.Exception -> L1182
            r3 = r28
            r11.L$3 = r3     // Catch: java.lang.Exception -> L1182
            r11.L$4 = r8     // Catch: java.lang.Exception -> L1182
            r11.L$5 = r12     // Catch: java.lang.Exception -> L1182
            r30 = r9
            r9 = r53
            r11.L$6 = r9     // Catch: java.lang.Exception -> L11af
            r31 = r9
            r9 = r52
            r11.L$7 = r9     // Catch: java.lang.Exception -> L11af
            r22 = r8
            r8 = r51
            r11.L$8 = r8     // Catch: java.lang.Exception -> L11af
            r20 = r14
            r14 = r50
            r11.L$9 = r14     // Catch: java.lang.Exception -> L11af
            r29 = r14
            r14 = r27
            r11.L$10 = r14     // Catch: java.lang.Exception -> L11af
            r11.L$11 = r6     // Catch: java.lang.Exception -> L11af
            r11.L$12 = r5     // Catch: java.lang.Exception -> L11af
            r11.L$13 = r7     // Catch: java.lang.Exception -> L11af
            r11.L$14 = r8     // Catch: java.lang.Exception -> L11af
            r28 = r3
            r3 = 9
            r11.label = r3     // Catch: java.lang.Exception -> L11af
            r21 = 0
            r24 = 16
            r25 = 0
            r54 = r28
            r3 = r9
            r26 = r4
            r4 = r19
            r19 = r5
            r5 = r18
            r18 = r6
            r6 = r21
            r21 = r7
            r7 = r75
            r55 = r8
            r8 = r24
            r56 = r9
            r11 = r30
            r57 = r31
            r9 = r25
            java.lang.Object r1 = o.C15974ebF.m8578onAptosSignMessagehUnOzRk$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L114a
            if (r1 != r10) goto L10aa
            return r10
        L10aa:
            r3 = r11
            r7 = r14
            r5 = r17
            r28 = r18
            r32 = r19
            r4 = r21
            r2 = r23
            r8 = r29
            r19 = r54
            r9 = r55
            r17 = r9
            r14 = r57
            r73 = r22
            r22 = r1
            r1 = r73
        L10c6:
            boolean r6 = kotlin.Result.m7384isSuccessimpl(r22)     // Catch: java.lang.Exception -> Lcb9
            if (r6 == 0) goto L112a
            kotlin.Result$Application r6 = kotlin.Result.Companion     // Catch: java.lang.Exception -> Lcb9
            java.lang.String r22 = (java.lang.String) r22     // Catch: java.lang.Exception -> Lcb9
            boolean r6 = o.C33129mqd.OLrzqt(r22)     // Catch: java.lang.Exception -> Lcb9
            if (r6 == 0) goto L112a
            kotlinx.serialization.json.Json r6 = o.C16013ebs.AhwBna(r1)     // Catch: java.lang.Exception -> L1125
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse r11 = new com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse     // Catch: java.lang.Exception -> L1125
            java.lang.String r29 = r4.getApplicationUrl()     // Catch: java.lang.Exception -> L1125
            long r30 = r4.getAptosChainId()     // Catch: java.lang.Exception -> L1125
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData r18 = r4.getData()     // Catch: java.lang.Exception -> L1125
            if (r18 == 0) goto L10ef
            java.lang.String r18 = r18.getMessage()     // Catch: java.lang.Exception -> L1125
            goto L10f1
        L10ef:
            r18 = 0
        L10f1:
            if (r18 != 0) goto L10f6
            r33 = r5
            goto L10f8
        L10f6:
            r33 = r18
        L10f8:
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData r18 = r4.getData()     // Catch: java.lang.Exception -> L1125
            if (r18 == 0) goto L1103
            java.lang.String r18 = r18.getNonce()     // Catch: java.lang.Exception -> L1125
            goto L1105
        L1103:
            r18 = 0
        L1105:
            if (r18 != 0) goto L110a
            r34 = r5
            goto L110c
        L110a:
            r34 = r18
        L110c:
            java.lang.String r35 = r4.getPrefix()     // Catch: java.lang.Exception -> L1125
            r27 = r11
            r36 = r22
            r27.<init>(r28, r29, r30, r32, r33, r34, r35, r36)     // Catch: java.lang.Exception -> L1125
            r6.getSerializersModule()     // Catch: java.lang.Exception -> L1125
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse$Companion r4 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse.Companion     // Catch: java.lang.Exception -> L1125
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch: java.lang.Exception -> L1125
            java.lang.String r22 = r6.encodeToString(r4, r11)     // Catch: java.lang.Exception -> L1125
            goto L112a
        L1125:
            java.lang.String r4 = "Failed to encode to AptosSignResponse"
            o.pUU.copydefault(r3, r4)     // Catch: java.lang.Exception -> Lcb9
        L112a:
            java.lang.Object r4 = kotlin.Result.m7377constructorimpl(r22)     // Catch: java.lang.Exception -> Lcb9
            kotlin.Result r4 = kotlin.Result.m7376boximpl(r4)     // Catch: java.lang.Exception -> Lcb9
            r23 = r2
            r11 = r4
            r2 = r13
            r6 = r14
            r14 = r20
            r4 = r1
            r1 = r7
            r13 = r9
            r7 = r56
            r9 = r3
            r3 = r19
            r73 = r12
            r12 = r5
            r5 = r73
            goto L1177
        L1147:
            r9 = r3
            goto L11b5
        L114a:
            r0 = move-exception
            goto L11b2
        L114d:
            r22 = r8
            r11 = r9
            r20 = r14
            r14 = r27
            r54 = r28
            r26 = r32
            r29 = r50
            r55 = r51
            r56 = r52
            r57 = r53
            r9 = r11
            r5 = r12
            r2 = r13
            r1 = r14
            r12 = r17
            r14 = r20
            r4 = r22
            r8 = r29
            r3 = r54
            r13 = r55
            r17 = r13
            r7 = r56
            r6 = r57
            r11 = 0
        L1177:
            r18 = r11
            r28 = r13
            r11 = r75
            r13 = r10
            r10 = r23
            goto L1683
        L1182:
            r0 = move-exception
            r11 = r9
            goto L11b2
        L1185:
            r22 = r8
            r11 = r9
            r20 = r14
            r14 = r27
            r54 = r28
            goto Lf6a
        L1190:
            r24 = r11
            r18 = r12
            r12 = r13
            r19 = r20
            r27 = r22
            r22 = r29
            r29 = r54
            r28 = r55
            r20 = r56
            r25 = r57
            r11 = r75
            r13 = r10
            goto L1669
        L11a8:
            r0 = move-exception
            r11 = r9
            goto L11b2
        L11ab:
            r0 = move-exception
            r11 = r30
            goto L11b2
        L11af:
            r0 = move-exception
            r11 = r30
        L11b2:
            r1 = r0
            goto L121b
        L11b5:
            r11 = r75
            goto L185c
        L11b9:
            r11 = r76
            r54 = r3
            r22 = r4
            r12 = r5
            r57 = r6
            r56 = r7
            r29 = r8
            r55 = r13
            r26 = r19
            r10 = r20
            r13 = r2
            r20 = r14
            r14 = r1
            java.lang.String r1 = "btc_signMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L1343
            if (r1 != 0) goto L11d9
        L11d8:
            goto L1190
        L11d9:
            java.lang.String r1 = "Start onBtcSignMessage"
            o.pUU.KWHzl(r11, r1)     // Catch: java.lang.Exception -> L1343
            kotlinx.serialization.json.JsonObject r1 = r14.getParams()     // Catch: java.lang.Exception -> L1343
            if (r1 == 0) goto L132a
            kotlinx.serialization.json.Json r2 = o.C16013ebs.AhwBna(r22)     // Catch: java.lang.Exception -> L1343
            r2.getSerializersModule()     // Catch: java.lang.Exception -> L1343
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest$Companion r3 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.Companion     // Catch: java.lang.Exception -> L1343
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch: java.lang.Exception -> L1323
            java.lang.Object r1 = r2.decodeFromJsonElement(r3, r1)     // Catch: java.lang.Exception -> L1323
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest r1 = (com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest) r1     // Catch: java.lang.Exception -> L1323
            java.util.Iterator r2 = r13.iterator()     // Catch: java.lang.Exception -> L1323
        L11fb:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L1323
            if (r3 == 0) goto L121d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L1219
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L1219
            o.dcq$StateListAnimator r5 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> L1219
            java.lang.String r4 = r5.KWHzl(r4)     // Catch: java.lang.Exception -> L1219
            java.lang.String r5 = r14.getCaipChainId()     // Catch: java.lang.Exception -> L1219
            boolean r4 = kotlin.jvm.internal.Intrinsics.EZpvd(r4, r5)     // Catch: java.lang.Exception -> L1219
            if (r4 == 0) goto L11fb
            goto L121e
        L1219:
            r0 = move-exception
            r1 = r0
        L121b:
            r9 = r11
            goto L11b5
        L121d:
            r3 = 0
        L121e:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1323
            if (r3 == 0) goto L12f0
            o.dcq$StateListAnimator r2 = o.C13983dcq.Companion     // Catch: java.lang.Exception -> L1323
            java.lang.String r2 = r2.OLrzqt(r3)     // Catch: java.lang.Exception -> L1323
            if (r2 == 0) goto L12f0
            o.ebF r3 = o.C16013ebs.copydefault(r22)     // Catch: java.lang.Exception -> L1323
            java.lang.String r4 = r12.DbNXlk()     // Catch: java.lang.Exception -> L1323
            java.lang.String r5 = r14.getCaipChainId()     // Catch: java.lang.Exception -> L1323
            kotlinx.serialization.json.Json r6 = o.C16013ebs.AhwBna(r22)     // Catch: java.lang.Exception -> L1323
            r7 = 1
            r8 = 0
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest r1 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.copy$default(r1, r8, r2, r7, r8)     // Catch: java.lang.Exception -> L1323
            r6.getSerializersModule()     // Catch: java.lang.Exception -> L1323
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest$Companion r2 = com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.Companion     // Catch: java.lang.Exception -> L1323
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> L1323
            java.lang.String r6 = r6.encodeToString(r2, r1)     // Catch: java.lang.Exception -> L1323
            r24 = r11
            r11 = r75
            r11.L$0 = r15     // Catch: java.lang.Exception -> L1565
            r9 = r20
            r11.L$1 = r9     // Catch: java.lang.Exception -> L1565
            r11.L$2 = r13     // Catch: java.lang.Exception -> L1565
            r8 = r54
            r11.L$3 = r8     // Catch: java.lang.Exception -> L1565
            r7 = r22
            r11.L$4 = r7     // Catch: java.lang.Exception -> L1565
            r11.L$5 = r12     // Catch: java.lang.Exception -> L1565
            r2 = r57
            r11.L$6 = r2     // Catch: java.lang.Exception -> L1565
            r1 = r56
            r11.L$7 = r1     // Catch: java.lang.Exception -> L1565
            r20 = r10
            r10 = r55
            r11.L$8 = r10     // Catch: java.lang.Exception -> L1565
            r19 = r9
            r9 = r29
            r11.L$9 = r9     // Catch: java.lang.Exception -> L1565
            r11.L$10 = r14     // Catch: java.lang.Exception -> L1565
            r11.L$11 = r10     // Catch: java.lang.Exception -> L1565
            r38 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> L1565
            r1 = 8
            r11.label = r1     // Catch: java.lang.Exception -> L1565
            java.lang.String r18 = "btc_message"
            r21 = 0
            r22 = 32
            r25 = 0
            r48 = r38
            r1 = r3
            r3 = r2
            r2 = r4
            r4 = r3
            r3 = r48
            r58 = r4
            r4 = r5
            r5 = r6
            r6 = r18
            r76 = r7
            r7 = r21
            r18 = r8
            r8 = r75
            r59 = r9
            r60 = r19
            r9 = r22
            r61 = r10
            r34 = r13
            r62 = r18
            r13 = r20
            r10 = r25
            java.lang.Object r1 = o.C15974ebF.m8580onBtcSignbMdYcbs$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L1565
            if (r1 != r13) goto L12b9
            return r13
        L12b9:
            r19 = r1
            r9 = r12
            r4 = r14
            r1 = r15
            r10 = r17
            r2 = r23
            r3 = r24
            r15 = r34
            r7 = r48
            r8 = r58
            r5 = r59
            r6 = r61
            r14 = r62
            r12 = r76
        L12d2:
            kotlin.Result r18 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r33 = r14
            r14 = r60
            r17 = r61
            r73 = r12
            r12 = r10
        L12df:
            r10 = r73
            r23 = r2
            r61 = r6
            r6 = r8
            r2 = r15
            r15 = r1
            r1 = r4
            r8 = r5
            r5 = r9
            r4 = r10
            r9 = r3
            r3 = r33
            goto L131d
        L12f0:
            r24 = r11
            r34 = r13
            r60 = r20
            r76 = r22
            r59 = r29
            r62 = r54
            r61 = r55
            r48 = r56
            r58 = r57
            r11 = r75
            r13 = r10
        L1305:
            r4 = r76
            r5 = r12
            r1 = r14
            r12 = r17
            r9 = r24
            r2 = r34
            r7 = r48
            r6 = r58
            r8 = r59
            r14 = r60
            r17 = r61
            r3 = r62
            r18 = 0
        L131d:
            r10 = r23
            r28 = r61
            goto L1683
        L1323:
            r0 = move-exception
            r24 = r11
            r11 = r75
            goto L1566
        L132a:
            r24 = r11
            r34 = r13
            r11 = r75
            r13 = r10
            r10 = r20
            r18 = r22
            r69 = r29
            r72 = r34
            r70 = r54
            r71 = r55
            r22 = r56
            r68 = r57
            goto L1551
        L1343:
            r0 = move-exception
            r24 = r11
            r11 = r75
            goto L1566
        L134a:
            r24 = r76
            r34 = r2
            r62 = r3
            r76 = r4
            r12 = r5
            r58 = r6
            r48 = r7
            r59 = r8
            r61 = r13
            r60 = r14
            r26 = r19
            r13 = r20
            r14 = r1
            java.lang.String r1 = "solana_signMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L148a
            if (r1 != 0) goto L137c
            r18 = r76
            r67 = r34
            r22 = r48
            r63 = r58
            r64 = r59
            r10 = r60
            r66 = r61
            r65 = r62
            goto L14ac
        L137c:
            kotlinx.serialization.json.JsonObject r1 = r14.getParams()     // Catch: java.lang.Exception -> L148a
            if (r1 == 0) goto L1478
            o.ebF r2 = o.C16013ebs.copydefault(r76)     // Catch: java.lang.Exception -> L1472
            java.lang.String r3 = r12.DbNXlk()     // Catch: java.lang.Exception -> L1472
            java.lang.String r4 = r14.getCaipChainId()     // Catch: java.lang.Exception -> L1472
            java.lang.String r5 = "bs58Message"
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L1472
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Exception -> L1472
            if (r1 == 0) goto L13a3
            kotlinx.serialization.json.JsonPrimitive r1 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r1)     // Catch: java.lang.Exception -> L1565
            if (r1 == 0) goto L13a3
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Exception -> L1565
            goto L13a4
        L13a3:
            r1 = 0
        L13a4:
            if (r1 != 0) goto L13a9
            r5 = r17
            goto L13aa
        L13a9:
            r5 = r1
        L13aa:
            r11.L$0 = r15     // Catch: java.lang.Exception -> L1472
            r10 = r60
            r11.L$1 = r10     // Catch: java.lang.Exception -> L1472
            r9 = r34
            r11.L$2 = r9     // Catch: java.lang.Exception -> L1472
            r8 = r62
            r11.L$3 = r8     // Catch: java.lang.Exception -> L1472
            r7 = r76
            r11.L$4 = r7     // Catch: java.lang.Exception -> L1472
            r11.L$5 = r12     // Catch: java.lang.Exception -> L1472
            r6 = r58
            r11.L$6 = r6     // Catch: java.lang.Exception -> L1472
            r1 = r48
            r11.L$7 = r1     // Catch: java.lang.Exception -> L1472
            r76 = r9
            r9 = r61
            r11.L$8 = r9     // Catch: java.lang.Exception -> L1472
            r28 = r8
            r8 = r59
            r11.L$9 = r8     // Catch: java.lang.Exception -> L1472
            r11.L$10 = r14     // Catch: java.lang.Exception -> L1472
            r11.L$11 = r9     // Catch: java.lang.Exception -> L1472
            r38 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> L1472
            r1 = 5
            r11.label = r1     // Catch: java.lang.Exception -> L1472
            r18 = 0
            r19 = 16
            r20 = 0
            r22 = r38
            r1 = r2
            r2 = r3
            r3 = r22
            r63 = r6
            r6 = r18
            r18 = r7
            r7 = r75
            r64 = r8
            r65 = r28
            r8 = r19
            r67 = r76
            r66 = r9
            r9 = r20
            java.lang.Object r1 = o.C15974ebF.m8588onSolSignMessagehUnOzRk$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L1472
            if (r1 != r13) goto L1405
            return r13
        L1405:
            r19 = r1
            r9 = r12
            r4 = r14
            r1 = r15
            r12 = r18
            r7 = r22
            r2 = r23
            r3 = r24
            r8 = r63
            r5 = r64
            r14 = r65
            r6 = r66
            r15 = r67
            r18 = r10
            r10 = r17
            r17 = r6
        L1422:
            boolean r20 = kotlin.Result.m7384isSuccessimpl(r19)     // Catch: java.lang.Exception -> L817
            if (r20 == 0) goto L1458
            kotlin.Result$Application r20 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L817
            r76 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L817
            r20 = r2
            kotlinx.serialization.json.Json r2 = o.C16013ebs.AhwBna(r12)     // Catch: java.lang.Exception -> L144c
            r2.getSerializersModule()     // Catch: java.lang.Exception -> L144c
            com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult$Companion r19 = com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult.Companion     // Catch: java.lang.Exception -> L144c
            r21 = r4
            kotlinx.serialization.KSerializer r4 = r19.serializer()     // Catch: java.lang.Exception -> L144e
            java.lang.Object r2 = r2.decodeFromString(r4, r1)     // Catch: java.lang.Exception -> L144e
            com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult r2 = (com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult) r2     // Catch: java.lang.Exception -> L144e
            java.lang.String r1 = r2.getSignature()     // Catch: java.lang.Exception -> L144e
            goto L1453
        L144c:
            r21 = r4
        L144e:
            java.lang.String r2 = "Failed to decode SolanaWCSignResult"
            o.pUU.copydefault(r3, r2)     // Catch: java.lang.Exception -> L817
        L1453:
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r1)     // Catch: java.lang.Exception -> L817
            goto L1462
        L1458:
            r76 = r1
            r20 = r2
            r21 = r4
            java.lang.Object r1 = kotlin.Result.m7377constructorimpl(r19)     // Catch: java.lang.Exception -> L817
        L1462:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r1)     // Catch: java.lang.Exception -> L817
            r19 = r1
            r4 = r12
            r2 = r15
            r23 = r20
            r1 = r21
            r15 = r76
            goto Lcb0
        L1472:
            r0 = move-exception
            r1 = r0
            r9 = r24
            goto L81f
        L1478:
            r10 = r60
            r18 = r76
            r72 = r34
            r22 = r48
            r68 = r58
            r69 = r59
            r71 = r61
            r70 = r62
            goto L1551
        L148a:
            r0 = move-exception
            goto L1566
        L148d:
            r24 = r76
            r67 = r2
            r65 = r3
            r18 = r4
            r12 = r5
            r63 = r6
            r22 = r7
            r64 = r8
            r66 = r13
            r10 = r14
            r26 = r19
            r13 = r20
            r14 = r1
            java.lang.String r1 = "starknet_signMessage"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L1565
            if (r1 != 0) goto L14c0
        L14ac:
            r19 = r10
            r27 = r18
            r20 = r22
            r25 = r63
            r22 = r64
            r29 = r65
            r28 = r66
            r18 = r12
            r12 = r67
            goto L1669
        L14c0:
            kotlinx.serialization.json.JsonObject r5 = r14.getParams()     // Catch: java.lang.Exception -> L1565
            if (r5 == 0) goto L1547
            o.ebF r1 = o.C16013ebs.copydefault(r18)     // Catch: java.lang.Exception -> L1565
            java.lang.String r2 = r12.DbNXlk()     // Catch: java.lang.Exception -> L1565
            java.lang.String r4 = r14.getCaipChainId()     // Catch: java.lang.Exception -> L1565
            r11.L$0 = r15     // Catch: java.lang.Exception -> L1565
            r11.L$1 = r10     // Catch: java.lang.Exception -> L1565
            r9 = r67
            r11.L$2 = r9     // Catch: java.lang.Exception -> L1565
            r8 = r65
            r11.L$3 = r8     // Catch: java.lang.Exception -> L1565
            r7 = r18
            r11.L$4 = r7     // Catch: java.lang.Exception -> L1565
            r11.L$5 = r12     // Catch: java.lang.Exception -> L1565
            r6 = r63
            r11.L$6 = r6     // Catch: java.lang.Exception -> L1565
            r3 = r22
            r11.L$7 = r3     // Catch: java.lang.Exception -> L1565
            r76 = r9
            r9 = r66
            r11.L$8 = r9     // Catch: java.lang.Exception -> L1565
            r28 = r8
            r8 = r64
            r11.L$9 = r8     // Catch: java.lang.Exception -> L1565
            r11.L$10 = r14     // Catch: java.lang.Exception -> L1565
            r11.L$11 = r9     // Catch: java.lang.Exception -> L1565
            r38 = r3
            r3 = 0
            r11.L$12 = r3     // Catch: java.lang.Exception -> L1565
            r3 = 13
            r11.label = r3     // Catch: java.lang.Exception -> L1565
            r18 = 0
            r19 = 16
            r20 = 0
            r22 = r38
            r3 = r22
            r68 = r6
            r6 = r18
            r18 = r7
            r7 = r75
            r69 = r8
            r70 = r28
            r8 = r19
            r72 = r76
            r71 = r9
            r9 = r20
            java.lang.Object r1 = o.C15974ebF.m8590onStarknetSignMessagehUnOzRk$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L1565
            if (r1 != r13) goto L152a
            return r13
        L152a:
            r19 = r1
            r1 = r10
            r9 = r12
            r4 = r14
            r10 = r17
            r7 = r22
            r2 = r23
            r3 = r24
            r8 = r68
            r5 = r69
            r14 = r70
            r6 = r71
            r17 = r6
        L1541:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            goto Ld89
        L1547:
            r68 = r63
            r69 = r64
            r70 = r65
            r71 = r66
            r72 = r67
        L1551:
            r19 = r10
            r27 = r18
            r20 = r22
            r25 = r68
            r22 = r69
            r29 = r70
            r28 = r71
            r18 = r12
            r12 = r72
            goto L1669
        L1565:
            r0 = move-exception
        L1566:
            r1 = r0
            goto L1850
        L1569:
            r24 = r76
            r72 = r2
            r70 = r3
            r18 = r4
            r68 = r6
            r22 = r7
            r69 = r8
            r71 = r13
            r10 = r14
            r26 = r19
            r13 = r20
            r14 = r1
            r8 = r5
            java.lang.String r1 = "tron_signMessageV2"
            boolean r1 = r9.equals(r1)     // Catch: java.lang.Exception -> L148a
            if (r1 != 0) goto L158a
            goto L1657
        L158a:
            kotlinx.serialization.json.JsonObject r1 = r14.getParams()     // Catch: java.lang.Exception -> L148a
            if (r1 == 0) goto L1657
            o.ebF r2 = o.C16013ebs.copydefault(r18)     // Catch: java.lang.Exception -> L1565
            java.lang.String r3 = r8.DbNXlk()     // Catch: java.lang.Exception -> L1565
            java.lang.String r4 = r14.getCaipChainId()     // Catch: java.lang.Exception -> L1565
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Exception -> L1565
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Exception -> L1565
            if (r1 == 0) goto L15af
            kotlinx.serialization.json.JsonPrimitive r1 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(r1)     // Catch: java.lang.Exception -> L1565
            if (r1 == 0) goto L15af
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Exception -> L1565
            goto L15b0
        L15af:
            r1 = 0
        L15b0:
            if (r1 != 0) goto L15b5
            r5 = r17
            goto L15b6
        L15b5:
            r5 = r1
        L15b6:
            com.okinc.business.defi.api.bean.TronSignMethodVersion r6 = com.okinc.business.defi.api.bean.TronSignMethodVersion.V2     // Catch: java.lang.Exception -> L1565
            r11.L$0 = r15     // Catch: java.lang.Exception -> L1565
            r11.L$1 = r10     // Catch: java.lang.Exception -> L1565
            r12 = r72
            r11.L$2 = r12     // Catch: java.lang.Exception -> L1565
            r9 = r70
            r11.L$3 = r9     // Catch: java.lang.Exception -> L1565
            r7 = r18
            r11.L$4 = r7     // Catch: java.lang.Exception -> L1565
            r11.L$5 = r8     // Catch: java.lang.Exception -> L1565
            r1 = r68
            r11.L$6 = r1     // Catch: java.lang.Exception -> L1565
            r19 = r10
            r10 = r22
            r11.L$7 = r10     // Catch: java.lang.Exception -> L1565
            r28 = r9
            r9 = r71
            r11.L$8 = r9     // Catch: java.lang.Exception -> L1565
            r22 = r7
            r7 = r69
            r11.L$9 = r7     // Catch: java.lang.Exception -> L1565
            r11.L$10 = r14     // Catch: java.lang.Exception -> L1565
            r11.L$11 = r9     // Catch: java.lang.Exception -> L1565
            r31 = r1
            r1 = 0
            r11.L$12 = r1     // Catch: java.lang.Exception -> L1565
            r1 = 12
            r11.label = r1     // Catch: java.lang.Exception -> L1565
            r18 = 0
            r20 = 32
            r21 = 0
            r25 = r31
            r1 = r2
            r2 = r3
            r3 = r10
            r27 = r22
            r22 = r7
            r7 = r18
            r18 = r8
            r8 = r75
            r29 = r28
            r28 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            java.lang.Object r1 = o.C15974ebF.m8594onTronSignMessagebMdYcbs$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L1565
            if (r1 != r13) goto L1613
            return r13
        L1613:
            r4 = r14
            r10 = r17
            r9 = r18
            r7 = r20
            r5 = r22
            r2 = r23
            r3 = r24
            r8 = r25
            r6 = r28
            r14 = r29
            r73 = r19
            r19 = r1
            r1 = r73
        L162c:
            kotlin.Result r19 = kotlin.Result.m7376boximpl(r19)     // Catch: java.lang.Exception -> Ld8c
            r72 = r12
            r18 = r27
            r17 = r28
            goto Ld89
        L1638:
            r23 = r2
            r10 = r12
            r2 = r72
            r73 = r18
            r18 = r1
            r1 = r4
            r4 = r73
            r74 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            r6 = r74
        L164b:
            r28 = r9
            r12 = r10
            r10 = r23
            r9 = r3
            r3 = r14
            r14 = r18
            r18 = r19
            goto L1683
        L1657:
            r19 = r10
            r27 = r18
            r20 = r22
            r25 = r68
            r22 = r69
            r29 = r70
            r28 = r71
            r12 = r72
            r18 = r8
        L1669:
            r2 = r12
            r1 = r14
            r12 = r17
            r5 = r18
            r14 = r19
            r7 = r20
            r8 = r22
            r10 = r23
            r9 = r24
            r6 = r25
            r4 = r27
            r17 = r28
            r3 = r29
            r18 = 0
        L1683:
            if (r18 == 0) goto L16c5
            java.lang.Object r18 = r18.m7386unboximpl()     // Catch: java.lang.Exception -> L16c1
            r76 = r1
            java.lang.Throwable r1 = kotlin.Result.m7380exceptionOrNullimpl(r18)     // Catch: java.lang.Exception -> L16c1
            if (r1 == 0) goto L16ac
            r19 = r2
            java.lang.String r2 = r1.getMessage()     // Catch: java.lang.Exception -> L16c1
            r20 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16c1
            r3.<init>()     // Catch: java.lang.Exception -> L16c1
            r3.append(r10)     // Catch: java.lang.Exception -> L16c1
            r3.append(r2)     // Catch: java.lang.Exception -> L16c1
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L16c1
            o.pUU.AEQbTJ(r9, r2, r1)     // Catch: java.lang.Exception -> L16c1
            goto L16b0
        L16ac:
            r19 = r2
            r20 = r3
        L16b0:
            kotlin.Result r1 = kotlin.Result.m7376boximpl(r18)     // Catch: java.lang.Exception -> L16c1
            r3 = r4
            r18 = r12
            r2 = r17
            r4 = r20
            r17 = r1
            r12 = r5
            r1 = r19
            goto L16d7
        L16c1:
            r0 = move-exception
            r1 = r0
            goto L81f
        L16c5:
            r76 = r1
            r19 = r2
            r20 = r3
            r3 = r4
            r18 = r12
            r2 = r17
            r1 = r19
            r4 = r20
            r17 = 0
            r12 = r5
        L16d7:
            r5 = r76
            r76 = r9
            r9 = r6
            r6 = r8
            r8 = r7
            r7 = r28
        L16e0:
            if (r17 == 0) goto L16f7
            java.lang.Object r17 = r17.m7386unboximpl()     // Catch: java.lang.Exception -> L88b
            boolean r19 = kotlin.Result.m7383isFailureimpl(r17)     // Catch: java.lang.Exception -> L88b
            if (r19 == 0) goto L16ee
            r17 = 0
        L16ee:
            java.lang.String r17 = (java.lang.String) r17     // Catch: java.lang.Exception -> L88b
            r73 = r17
            r17 = r10
            r10 = r73
            goto L16fa
        L16f7:
            r17 = r10
            r10 = 0
        L16fa:
            r11.L$0 = r15     // Catch: java.lang.Exception -> L88b
            r11.L$1 = r14     // Catch: java.lang.Exception -> L88b
            r11.L$2 = r1     // Catch: java.lang.Exception -> L88b
            r11.L$3 = r4     // Catch: java.lang.Exception -> L88b
            r11.L$4 = r3     // Catch: java.lang.Exception -> L88b
            r11.L$5 = r12     // Catch: java.lang.Exception -> L88b
            r11.L$6 = r9     // Catch: java.lang.Exception -> L88b
            r11.L$7 = r8     // Catch: java.lang.Exception -> L88b
            r11.L$8 = r7     // Catch: java.lang.Exception -> L88b
            r11.L$9 = r6     // Catch: java.lang.Exception -> L88b
            r11.L$10 = r5     // Catch: java.lang.Exception -> L88b
            r11.L$11 = r10     // Catch: java.lang.Exception -> L88b
            r11.L$12 = r2     // Catch: java.lang.Exception -> L88b
            r19 = r1
            r1 = 0
            r11.L$13 = r1     // Catch: java.lang.Exception -> L88b
            r11.L$14 = r1     // Catch: java.lang.Exception -> L88b
            r1 = 14
            r11.label = r1     // Catch: java.lang.Exception -> L88b
            r20 = r2
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r1, r11)     // Catch: java.lang.Exception -> L88b
            if (r1 != r13) goto L172a
            return r13
        L172a:
            r23 = r17
            r17 = r18
            r2 = r19
            r1 = r20
            r19 = r14
            r14 = r12
            r12 = r15
            r15 = r3
            r3 = r4
            r4 = r10
            r10 = r7
            r7 = r8
            r8 = r6
            r6 = r9
            r9 = r76
        L173f:
            if (r4 != 0) goto L1767
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error r4 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Error     // Catch: java.lang.Exception -> L1762
            r76 = r2
            java.lang.String r2 = r5.getMethod()     // Catch: java.lang.Exception -> L1762
            java.lang.String r5 = r5.getCaipChainId()     // Catch: java.lang.Exception -> L1762
            r18 = r3
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r3 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Exception -> L1762
            r20 = r7
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r7 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.METHOD_NOT_SUPPORTED     // Catch: java.lang.Exception -> L1762
            r21 = r8
            r22 = r9
            r8 = 2
            r9 = 0
            r3.<init>(r7, r9, r8, r9)     // Catch: java.lang.Exception -> L17b0
            r4.<init>(r2, r5, r3)     // Catch: java.lang.Exception -> L17b0
            goto L1798
        L1762:
            r0 = move-exception
            r22 = r9
            goto La67
        L1767:
            r76 = r2
            r18 = r3
            r20 = r7
            r21 = r8
            r22 = r9
            int r2 = r4.length()     // Catch: java.lang.Exception -> L17b0
            if (r2 != 0) goto L178a
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> L17b0
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r2 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException     // Catch: java.lang.Exception -> L17b0
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r3 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.USER_REJECTED     // Catch: java.lang.Exception -> L17b0
            r4 = 2
            r5 = 0
            r2.<init>(r3, r5, r4, r5)     // Catch: java.lang.Exception -> L17b0
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error r3 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error     // Catch: java.lang.Exception -> L17b0
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L17b0
            return r3
        L178a:
            java.lang.String r2 = r5.getMethod()     // Catch: java.lang.Exception -> L17b0
            java.lang.String r3 = r5.getCaipChainId()     // Catch: java.lang.Exception -> L17b0
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Success r5 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$ConnectRequestMethodResponse$Success     // Catch: java.lang.Exception -> L17b0
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L17b0
            r4 = r5
        L1798:
            r1.add(r4)     // Catch: java.lang.Exception -> L17b0
            r2 = r76
            r5 = r14
            r4 = r15
            r3 = r18
            r14 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r15 = r12
            r12 = r13
            r13 = r10
            r10 = r26
            goto L777
        L17b0:
            r0 = move-exception
            r1 = r0
            r9 = r22
            goto L185c
        L17b6:
            r0 = move-exception
            r24 = r76
            goto L1566
        L17bb:
            r0 = move-exception
            r24 = r9
            goto L1566
        L17c0:
            r24 = r9
            r28 = r13
            r19 = r14
            r1 = r28
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L17cf
            r6 = r1
            r9 = r15
            r1 = r19
            goto L17d8
        L17cf:
            r0 = move-exception
            goto L17d4
        L17d1:
            r0 = move-exception
            r24 = r9
        L17d4:
            r1 = r0
            goto L743
        L17d7:
            r6 = 0
        L17d8:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L148a
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.copydefault(r9, r2)     // Catch: java.lang.Exception -> L148a
            r4.<init>(r2)     // Catch: java.lang.Exception -> L148a
            java.util.Iterator r2 = r9.iterator()     // Catch: java.lang.Exception -> L148a
        L17e7:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L148a
            if (r3 == 0) goto L1840
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L148a
            r16 = r3
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account r16 = (com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account) r16     // Catch: java.lang.Exception -> L148a
            T r3 = r1.element     // Catch: java.lang.Exception -> L148a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L148a
            if (r3 == 0) goto L183a
            boolean r5 = o.C33129mqd.OLrzqt(r3)     // Catch: java.lang.Exception -> L148a
            if (r5 == 0) goto L1802
            goto L1803
        L1802:
            r3 = 0
        L1803:
            if (r3 == 0) goto L183a
            java.lang.String r5 = r16.getNamespace()     // Catch: java.lang.Exception -> L148a
            o.dcu$Fragment$ActionBar r7 = o.InterfaceC13987dcu.Fragment.Companion     // Catch: java.lang.Exception -> L148a
            java.lang.String r7 = r7.OLrzqt()     // Catch: java.lang.Exception -> L148a
            boolean r5 = kotlin.jvm.internal.Intrinsics.EZpvd(r5, r7)     // Catch: java.lang.Exception -> L148a
            if (r5 == 0) goto L1838
            java.util.List r5 = r16.getAddresses()     // Catch: java.lang.Exception -> L148a
            java.util.Set r5 = kotlin.collections.CollectionsKt.zuBGHE(r5)     // Catch: java.lang.Exception -> L148a
            r5.add(r3)     // Catch: java.lang.Exception -> L148a
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L148a
            java.util.List r18 = kotlin.collections.CollectionsKt.wlaJM(r5)     // Catch: java.lang.Exception -> L148a
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 29
            r23 = 0
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account r3 = com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.copy$default(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Exception -> L148a
            r16 = r3
        L1838:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L148a
        L183a:
            r3 = r16
            r4.add(r3)     // Catch: java.lang.Exception -> L148a
            goto L17e7
        L1840:
            o.ctV r1 = r11.$wallet     // Catch: java.lang.Exception -> L148a
            java.lang.String r5 = r1.AYXKKw()     // Catch: java.lang.Exception -> L148a
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts r1 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Accounts     // Catch: java.lang.Exception -> L148a
            r3 = 0
            r7 = 1
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L148a
            goto L1889
        L1850:
            r9 = r24
            goto L185c
        L1853:
            r0 = move-exception
            goto L17d4
        L1856:
            r0 = move-exception
            r24 = r3
            goto L17d4
        L185b:
            r9 = r3
        L185c:
            java.lang.String r2 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to get accounts: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            o.pUU.AEQbTJ(r9, r2, r1)
            com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts r1 = r11.$requestAccounts
            java.lang.String r1 = r1.getName()
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException r2 = new com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException
            com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$ErrorType r3 = com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException.ErrorType.UNKNOWN
            r4 = 2
            r5 = 0
            r2.<init>(r3, r5, r4, r5)
            com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error r3 = new com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess$Payload$Response$Error
            r3.<init>(r1, r2)
            r1 = r3
        L1889:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$onRequestAccounts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$31$lambda$23$lambda$21(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
