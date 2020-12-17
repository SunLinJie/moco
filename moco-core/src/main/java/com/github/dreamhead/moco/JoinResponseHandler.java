package com.github.dreamhead.moco;

import com.github.dreamhead.moco.internal.SessionContext;
import com.github.dreamhead.moco.recorder.MocoGroup;

public class JoinResponseHandler implements ResponseHandler {
    private final MocoGroup group;

    public JoinResponseHandler(final MocoGroup group) {
        this.group = group;
    }

    @Override
    public ResponseHandler apply(final MocoConfig config) {
        return this;
    }

    @Override
    public void writeToResponse(final SessionContext context) {
        context.join(group);
    }
}
