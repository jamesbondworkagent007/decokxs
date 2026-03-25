package com.okinc.business.defi.dapp.webview.okxconnect;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestWalletsResponse {
    public static final int $stable = 8;
    private final List<Address> address;
    private final int keyringIdentityType;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.webview.okxconnect.RequestWalletsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestWalletsResponse copy$default(RequestWalletsResponse requestWalletsResponse, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = requestWalletsResponse.name;
        }
        if ((i2 & 2) != 0) {
            i = requestWalletsResponse.keyringIdentityType;
        }
        if ((i2 & 4) != 0) {
            list = requestWalletsResponse.address;
        }
        return requestWalletsResponse.copy(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.keyringIdentityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequestWalletsResponse copy(@NotNull String str, int i, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RequestWalletsResponse(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestWalletsResponse)) {
            return false;
        }
        RequestWalletsResponse requestWalletsResponse = (RequestWalletsResponse) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) requestWalletsResponse.name) && this.keyringIdentityType == requestWalletsResponse.keyringIdentityType && Intrinsics.EZpvd(this.address, requestWalletsResponse.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Address> getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKeyringIdentityType() {
        return this.keyringIdentityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.keyringIdentityType)) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RequestWalletsResponse(name=" + this.name + ", keyringIdentityType=" + this.keyringIdentityType + ", address=" + this.address + ")";
    }

    public RequestWalletsResponse(@NotNull String str, int i, @NotNull List<Address> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.keyringIdentityType = i;
        this.address = list;
    }
}
