import type {ReactNode} from 'react';
import Layout from '@theme/Layout';
import Heading from '@theme/Heading';

export default function Home(): ReactNode {
  return (
    <Layout title="SU Craftable Name Tag Wiki" description="Documentation for the SU Craftable Name Tag Minecraft mod">
      <main style={{textAlign: 'center', marginTop: '4rem'}}>
        <Heading as="h1">Welcome to the SU Craftable Name Tag Wiki</Heading>
        <p style={{fontSize: '1.2rem'}}>Use the navigation bar to explore installation, usage, FAQ, and technical details.</p>
        <p>
          <a className="button button--primary button--lg" href="/docs/intro">
            Go to Wiki
          </a>
        </p>
      </main>
    </Layout>
  );
}
