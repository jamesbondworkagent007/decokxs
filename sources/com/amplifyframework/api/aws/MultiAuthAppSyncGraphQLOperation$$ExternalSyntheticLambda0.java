package com.amplifyframework.api.aws;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MultiAuthAppSyncGraphQLOperation$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ MultiAuthAppSyncGraphQLOperation f$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.amplifyframework.api.aws.MultiAuthAppSyncGraphQLOperation.dispatchRequest():void, com.amplifyframework.api.aws.MultiAuthAppSyncGraphQLOperation.start():void] */
    public /* synthetic */ MultiAuthAppSyncGraphQLOperation$$ExternalSyntheticLambda0(MultiAuthAppSyncGraphQLOperation multiAuthAppSyncGraphQLOperation) {
        this.f$0 = multiAuthAppSyncGraphQLOperation;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.amplifyframework.api.aws.MultiAuthAppSyncGraphQLOperation.$r8$lambda$sdwVzJgKtFD8Vf7lLC8v-qA0OUc(com.amplifyframework.api.aws.MultiAuthAppSyncGraphQLOperation):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.dispatchRequest();
    }
}
