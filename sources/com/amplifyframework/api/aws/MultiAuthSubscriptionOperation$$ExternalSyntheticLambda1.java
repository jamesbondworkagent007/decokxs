package com.amplifyframework.api.aws;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ MultiAuthSubscriptionOperation f$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.amplifyframework.api.aws.MultiAuthSubscriptionOperation.dispatchRequest():void, com.amplifyframework.api.aws.MultiAuthSubscriptionOperation.lambda$dispatchRequest$1(com.amplifyframework.api.graphql.GraphQLResponse):void, com.amplifyframework.api.aws.MultiAuthSubscriptionOperation.lambda$dispatchRequest$2(com.amplifyframework.api.ApiException):void, com.amplifyframework.api.aws.MultiAuthSubscriptionOperation.start():void] */
    public /* synthetic */ MultiAuthSubscriptionOperation$$ExternalSyntheticLambda1(MultiAuthSubscriptionOperation multiAuthSubscriptionOperation) {
        this.f$0 = multiAuthSubscriptionOperation;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.amplifyframework.api.aws.MultiAuthSubscriptionOperation.$r8$lambda$JtcabZnNSNwb3eJHAsHinrqaFTo(com.amplifyframework.api.aws.MultiAuthSubscriptionOperation):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.dispatchRequest();
    }
}
