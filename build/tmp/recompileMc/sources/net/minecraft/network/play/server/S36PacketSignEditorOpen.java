package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class S36PacketSignEditorOpen implements Packet<INetHandlerPlayClient>
{
    private BlockPos signPosition;

    public S36PacketSignEditorOpen()
    {
    }

    public S36PacketSignEditorOpen(BlockPos signPositionIn)
    {
        this.signPosition = signPositionIn;
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    public void processPacket(INetHandlerPlayClient handler)
    {
        handler.handleSignEditorOpen(this);
    }

    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.signPosition = buf.readBlockPos();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.signPosition);
    }

    @SideOnly(Side.CLIENT)
    public BlockPos getSignPosition()
    {
        return this.signPosition;
    }
}