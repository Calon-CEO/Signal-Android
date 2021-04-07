package org.thoughtcrime.securesms.groups.ui.managegroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import org.thoughtcrime.securesms.R;
import org.thoughtcrime.securesms.recipients.RecipientId;
import org.thoughtcrime.securesms.wallpaper.ChatWallpaperActivity;

public class ManageGroupNoteActivity extends AppCompatActivity {

    private static final String EXTRA_RECIPIENT_ID = "extra.recipient.id";

    public static @NonNull
    Intent createIntent(@NonNull Context context) {
        return createIntent(context, null);
    }

    public static @NonNull Intent createIntent(@NonNull Context context, @Nullable RecipientId recipientId) {
        Intent intent = new Intent(context, ManageGroupNoteActivity.class);
        intent.putExtra(EXTRA_RECIPIENT_ID, recipientId);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_group_note);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}